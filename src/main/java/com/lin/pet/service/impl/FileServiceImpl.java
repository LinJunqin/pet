package com.lin.pet.service.impl;



import com.lin.pet.constant.StatusConstant;
import com.lin.pet.exception.BadRequestException;
import com.lin.pet.service.FileService;
import com.lin.pet.util.CommonUtils;
import com.lin.pet.util.FileUtils;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xhans on 2016/3/28.
 */
@Service
public class FileServiceImpl implements FileService {

    static Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    private QiniuUploader qiniuUploader;

    //图片不大于2m
    private static int ALLOW_SIZE = 2 << 20;

    //图片根目录
    private static String IMAGE_PATH = "/home/ubuntu/images";
    private static String SERVER_PATH = "http://112.74.215.22/images";

    @Autowired
    public FileServiceImpl(QiniuUploader qiniuUploader) {
        this.qiniuUploader = qiniuUploader;
    }

    @Override
    public String saveImageToDisk(MultipartFile file) {
        try {
            isValidImage(file.getContentType(), file.getSize());
            String generatedImagePath = generateImagePath(file);
            String path = IMAGE_PATH + generatedImagePath;
            File newFile = new File(path);
            //检查文件是否已经存在
            if (!newFile.exists()) {
                //创建父目录
                new File(newFile.getParent()).mkdirs();
                file.transferTo(new File(path));
            }
            return SERVER_PATH + generatedImagePath;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            //throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "图片保存失败");
        } catch (IOException e) {
            e.printStackTrace();
           // throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "图片保存失败");
        }
        return "";
    }

    @Override
    public String saveImageToQiniu(MultipartFile file) {
        isValidImage(file.getContentType(), file.getSize());
        try {
            return qiniuUploader.upload(file);
        } catch (QiniuException e) {
            Response response = e.response;
            try {
                logger.error(response.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
           // throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "图片保存失败");
        } catch (IOException e) {
            e.printStackTrace();
           // throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "图片保存失败");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            //throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "图片保存失败");
        }
        return "";//
    }

    @Override
    public String saveFileToQiniu(MultipartFile file) {
        isValidFile(file.getContentType(), file.getSize());
        try {
            return qiniuUploader.upload(file);
        } catch (QiniuException e) {
            Response response = e.response;
            try {
                logger.error(response.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
           // throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "文件保存失败");
        } catch (IOException e) {
            e.printStackTrace();
           // throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "文件保存失败");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
          //  throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "文件保存失败");
        }
        return "";
    }

    private void isValidFile(String contentType, long size) {
        if (!checkFileType(contentType)) {
            throw new BadRequestException(StatusConstant.SEVER_ERROR, "非法的文件资源，只允许pdf、mk");
        }
        if (!checkImageSize(size)) {
            throw new BadRequestException(StatusConstant.SEVER_ERROR, "文件不能大于2m");
        }
    }

    private boolean checkFileType(String contentType) {
        if (contentType == null){
            return false;
        }
        return contentType.equals("application/pdf")
                || contentType.equals("text/markdown")
                || contentType.equals(MediaType.IMAGE_JPEG_VALUE)
                || contentType.equals(MediaType.IMAGE_PNG_VALUE);

    }

    @Override
    public String saveImageToQiniu(byte[] file) {
        try {
            String fileType = FileUtils.getFileType(file);
            isValidImage(fileType, file.length);

            return qiniuUploader.upload(file, "html");
        } catch (QiniuException e){
            Response response = e.response;
            try {
                logger.error(response.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
           // throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "图片保存失败");
        } catch(IOException e) {
            e.printStackTrace();
           // throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "图片保存失败");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
           // throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "图片保存失败");
        }
        return "";
    }

    public static void isValidImage(String type, long size) {
        if (!checkImageType(type)) {
            throw new BadRequestException(StatusConstant.SEVER_ERROR, "非法的图片资源，只允许png,gif,jpeg");
        }
        if (!checkImageSize(size)) {
            throw new BadRequestException(StatusConstant.SEVER_ERROR, "图片不能大于2m");
        }
    }

    public static boolean checkImageType(String fileType) {
        if (fileType == null){
            return false;
        }
        return fileType.equals(MediaType.IMAGE_GIF_VALUE)
                || fileType.equals(MediaType.IMAGE_JPEG_VALUE)
                || fileType.equals(MediaType.IMAGE_PNG_VALUE);
    }

    @Override
    public String saveHtmlToQiniu(byte[] file) {
        try {
            String fileType = FileUtils.getFileType(file);
            logger.info(fileType);
            isValidHtml(fileType, file.length);

            return qiniuUploader.upload(file, fileType);
        } catch (QiniuException e){
            Response response = e.response;
            try {
                logger.error(response.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
           // throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "html保存失败");
        } catch(IOException e) {
            e.printStackTrace();
          //  throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "html保存失败");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
          //  throw new InternalErrorException(ErrorType.INTERNAL_ERROR, "html保存失败");
        }
        return "" ;
    }

    public static void isValidHtml(String type, long size) {
//        if (!checkHtmlType(type)) {
//            throw new BadRequestException(ErrorType.ILLEGAL_FILE, "非法的html资源");
//        }
        if (!checkImageSize(size)) {
            throw new BadRequestException(StatusConstant.SEVER_ERROR, "公告不能大于2m");
        }
    }

    public static boolean checkHtmlType(String fileType) {
        if (fileType == null){
            return false;
        }
        return fileType.equals(MediaType.TEXT_HTML_VALUE);
    }

    public static boolean checkImageSize(long size) {
        return size < ALLOW_SIZE;
    }

    //根据文件md5编码命名文件，根据md5分两级目录
    public static String generateImagePath(MultipartFile file) throws IOException, NoSuchAlgorithmException {
        String md5 = CommonUtils.md5(file.getBytes());
        return "/" + md5.substring(0, 2) +
                "/" + md5.substring(2, 4) +
                "/" + md5.substring(4) +
                "." + file.getContentType().substring(6);
    }
}

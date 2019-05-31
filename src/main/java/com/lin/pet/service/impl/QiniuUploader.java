package com.lin.pet.service.impl;



import com.lin.pet.util.CommonUtils;
import com.lin.pet.util.JsonUtils;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * Created by xhans on 2016/4/11.
 */
public class QiniuUploader {

    static Logger logger = LoggerFactory.getLogger(QiniuUploader.class);

    //密钥配置
    private Auth auth;
    //创建上传对象
    private UploadManager uploadManager;

    //空间名
    private String bucketName;

    //图片服务器的域名
    private String domain;

    public QiniuUploader(String accessKey, String secretKey, String bucketName, String domain){
        this.bucketName = bucketName;
        this.domain = domain;
        this.auth = Auth.create(accessKey, secretKey);
        Configuration cfg = new Configuration(Zone.zone2());
        this.uploadManager = new UploadManager(cfg);
    }

    //简单上传，使用默认策略，只需要设置上传的空间名就可以了
    public String getDefaultUpToken(){
        return auth.uploadToken(bucketName);
    }

    public String upload(MultipartFile file) throws IOException, NoSuchAlgorithmException {
        //用文件的MD5编码作为文件名
        String key = CommonUtils.md5(file.getBytes()) + "." + file.getContentType().substring(6);
        Response response = uploadManager.put(file.getBytes(), key, getDefaultUpToken());
        logger.debug(response.toString());
        Map<String, String> map = JsonUtils.decode(response.bodyString(), Map.class);
        return domain + map.get("key");
    }

    public String upload(byte[] file, String fileType) throws NoSuchAlgorithmException, QiniuException {
//        logger.info(fileType);
        String key = CommonUtils.md5(file) + ".html";
//                + fileType;
//        logger.info(key);
        Response response = uploadManager.put(file, key, getDefaultUpToken());
        logger.debug(response.toString());
        Map<String, String> map = JsonUtils.decode(response.bodyString(), Map.class);
        return domain + map.get("key");
    }
}

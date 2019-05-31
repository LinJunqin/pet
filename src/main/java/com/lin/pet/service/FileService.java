package com.lin.pet.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by xhans on 2016/3/28.
 */
public interface FileService {
    String saveImageToDisk(MultipartFile file);
    String saveHtmlToQiniu(byte[] file);
    String saveImageToQiniu(MultipartFile file);
    String saveFileToQiniu(MultipartFile file);
    String saveImageToQiniu(byte[] file);
}

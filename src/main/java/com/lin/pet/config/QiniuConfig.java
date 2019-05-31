package com.lin.pet.config;


import com.lin.pet.service.impl.QiniuUploader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yonah on 15-11-4.
 */
@Configuration
public class QiniuConfig {

    @Value("${qiniu.accesskey}")
    private String accesskey;

    @Value("${qiniu.secretkey}")
    private String secretkey;

    @Value("${qiniu.bucket}")
    private String bucket;

    @Value("${qiniu.domain}")
    private String domain;



    @Bean
    public QiniuUploader qiniuUploader(){
        return new QiniuUploader(accesskey, secretkey, bucket, domain);
    }

}
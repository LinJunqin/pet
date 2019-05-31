package com.lin.pet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 将生成的token缓存在redis里
 * redis 中的格式 "userId:deviceId":"refresh_token"
 * @author lin junqin
 * @date 2018/11/22
 *
 */
@Component
public class RedisTokenDAO {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    public void save(String userId, String deviceId,String refreshToken){
        redisTemplate.opsForValue().set(buildKey(userId, deviceId), refreshToken, 5, TimeUnit.MINUTES);
    }

    public String get(String userId,String deviceId){
        Object refreshToken = redisTemplate.opsForValue().get(buildKey(userId, deviceId));
        if(refreshToken == null){
            return "";
        }
        return (String)refreshToken;
    }

    public void remove(String userId,String deviceId) {
        redisTemplate.delete(buildKey(userId, deviceId));
    }

    private String buildKey(String userId,String deviceId){
        return userId+":"+deviceId;
    }

}

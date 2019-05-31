package com.lin.pet.service.impl;


import com.lin.pet.dao.RedisTokenDAO;
import com.lin.pet.dao.UserMapper;
import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.User;
import com.lin.pet.service.LoginService;
import com.lin.pet.util.CommonUtils;
import com.lin.pet.util.IdWorker;
import com.lin.pet.util.SmsSender;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author lin
 */
@Service
public class LoginServiceImpl implements LoginService {
    static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
   @Autowired
    UserMapper userMapper;
   @Autowired
   IdWorker idWorker;
   @Autowired
    RedisTokenDAO redisTokenDAO;
    @Override
    public ServerResponse sendCode(String phone) {
        // 生成验证码
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String code ="";
            for(int i= 0;i<4;i++){
                code += RandomUtils.nextInt(1,9);
            }
            if(SmsSender.sendIdentityCode(code,phone)){
               // request.getSession().setAttribute(phone,code);
                redisTokenDAO.save(phone,phone,code);
                logger.info("phone "+phone+"code "+code);
                return ServerResponse.createBySuccess();
            }else{
                return ServerResponse.createByError();
            }
    }

    @Override
    public ServerResponse login(String phone, String code) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        if(validCode(request,code,phone)){
            User user = userMapper.selectByPhone(phone);
            if(user==null){
                user = new User();
                user.setAvatar("");
                user.setCreateTime(new Date());
                user.setGender(Boolean.FALSE);
                user.setLoginTime(new Date());
                user.setPhone(phone);
                user.setModifiedTime(new Date());
                user.setUserId(idWorker.nextId());
                user.setUsername(phone);
                userMapper.insert(user);
            }else{
                user.setLoginTime(new Date());
                userMapper.updateByPrimaryKeySelective(user);
            }
            user.setModifiedTime(null);
            user.setLoginTime(null);
            user.setCreateTime(null);
            return ServerResponse.createBySuccess(user);
        }
        return ServerResponse.createByErrorMessage("验证码错误");
    }

    @Override
    public ServerResponse checkLogin(String phone) {
        User user = userMapper.selectByPhone(phone);
        long distance = System.currentTimeMillis() - user.getLoginTime().getTime();
        if(distance>7*3600*1000){
            return ServerResponse.createByNeedLogin();
        }else{
            user.setLoginTime(new Date());
            userMapper.updateByPrimaryKeySelective(user);
            return ServerResponse.createBySuccess();
        }

    }
    public boolean validCode(HttpServletRequest request, String code,String phone) {
        // 校验验证码
        //String codeSaved = (String) request.getSession().getAttribute(phone);
        String codeSaved = redisTokenDAO.get(phone,phone);
        logger.info("codeSaved "+codeSaved+"code "+code);
        return code.equals(codeSaved);
    }
}

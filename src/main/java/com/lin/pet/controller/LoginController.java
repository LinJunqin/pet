package com.lin.pet.controller;

import com.lin.pet.entity.ServerResponse;
import com.lin.pet.service.LoginService;
import com.lin.pet.service.impl.LoginServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lin
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {
    static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
    @Autowired
    LoginService loginService;

    @PostMapping(value = "/send_code/{phone}")
    public ServerResponse sendCode(@PathVariable("phone") String phone){

        return loginService.sendCode(phone);
    }

    @PostMapping(value = "/login")
    public ServerResponse login(@RequestParam("phone")String phone,
                                @RequestParam("code")String code){
        return loginService.login(phone,code);
    }

    @PostMapping(value = "/auto/{phone}")
    public ServerResponse checkLogin(@PathVariable("phone") String phone){
        return loginService.checkLogin(phone);
    }
    public boolean validCode(HttpServletRequest request, String code,String phone) {
        // 校验验证码
        String codeSaved = (String) request.getSession().getAttribute(phone);
        logger.info("codeSaved "+codeSaved+"code "+code);
        return code.equals(codeSaved);
    }
}

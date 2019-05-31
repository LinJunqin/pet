package com.lin.pet.service;

import com.lin.pet.entity.ServerResponse;

/**
 * @author lin
 */
public interface LoginService {
    ServerResponse sendCode(String phone);
    ServerResponse login(String phone,String code);
    ServerResponse checkLogin(String phone);
}

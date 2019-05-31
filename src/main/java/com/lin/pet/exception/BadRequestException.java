package com.lin.pet.exception;


import com.lin.pet.entity.ResponseCode;

/**
 *
 * @author linjunqin
 *
 */
public class BadRequestException extends BasicException{
    public BadRequestException(int error, String description) {
        super(error, description);
    }
    public BadRequestException(String description){
        super(description);
        this.setError(ResponseCode.BAD_REQUEST.getCode());
    }
}

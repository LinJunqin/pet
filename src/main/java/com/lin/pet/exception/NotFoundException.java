package com.lin.pet.exception;


import com.lin.pet.entity.ResponseCode;

/**
 * @author linjunqin
 *
 */
public class NotFoundException extends BasicException{

    public NotFoundException(int error, String description) {
        super(error, description);
    }
    public NotFoundException(String description){
        super(description);
        this.setError(ResponseCode.NOT_FOUND.getCode());
    }
}

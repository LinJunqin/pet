package com.lin.pet.exception;


import com.lin.pet.entity.ResponseCode;

/**
 * @author linjunqin
 *
 */
public class InternalErrorException extends BasicException{
    public InternalErrorException(int error, String description) {
        super(error, description);
    }
    public InternalErrorException(String description){
        super(description);
        this.setError(ResponseCode.INTERNAL_ERROR.getCode());
    }
}

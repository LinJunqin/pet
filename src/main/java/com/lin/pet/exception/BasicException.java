package com.lin.pet.exception;

/**
 * 运行时异常基类
 * @author linjunqin
 *
 */
public class BasicException extends RuntimeException {
    private int error;
    private String description;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BasicException(int error, String description) {
        this.error = error;
        this.description = description;
    }
    public BasicException(String description){
        this.description = description;
    }
}

package com.lin.pet.entity;

/**
 * @author linjunqin
 * @date 2018/11/13
 */
public enum ResponseCode {
    /**
     * 成功
     */
    SUCCESS(10001,"SUCCESS"),
    /**
     *失败
     */
    ERROR(10002,"ERROR"),
    /**
     * 需要登陆
     */
    NEED_LOGIN(10003,"NEED_LOGIN"),
    /**
     * 非法参数
     */
    ILLEGAL_ARGUMENT(10004,"ILLEGAL_ARGUMENT"),
    /**
     *  资源没发现
     */
    NOT_FOUND(10005,"NOT_FOUND"),
    /**
     * 请求错误
     *
     */
    BAD_REQUEST(10006,"BAD_REQUEST"),
    /**
     * 不可获得
     *
     */
    INTERNAL_ERROR(10007,"INTERNAL_ERROR");
    private final int code;
    private final String desc;


    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

}

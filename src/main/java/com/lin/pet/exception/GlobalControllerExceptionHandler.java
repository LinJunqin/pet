package com.lin.pet.exception;



import com.lin.pet.entity.ResponseCode;
import com.lin.pet.entity.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;


/**
 * 全局运行时异常统一处理类
 * @author linjunqin
 *
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = NotFoundException.class)
    @ResponseBody
    public ServerResponse handleNotFound(HttpServletRequest req, NotFoundException ex){
        logger.info("{} not found, reason: {}", req.getRequestURI(), ex.getDescription());
        return ServerResponse.createByErrorCodeMessage(ex.getError(),ex.getDescription());
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = BadRequestException.class)
    @ResponseBody
    public ServerResponse handleBadRequest(HttpServletRequest req, BadRequestException ex) {
        logger.info("{} bad request, reason: {}", req.getRequestURI(), ex.getDescription());
        return ServerResponse.createByErrorCodeMessage(ex.getError(),ex.getDescription());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = InternalErrorException.class)
    @ResponseBody
    public ServerResponse handleNotAcceptable(HttpServletRequest req, InternalErrorException ex){
        logger.info("{} not acceptable, reason: {}", req.getRequestURI(), ex.getDescription());
        return ServerResponse.createByErrorCodeMessage(ex.getError(),ex.getDescription());
    }
    @ResponseBody
    @ExceptionHandler(value= Exception.class)
    public ServerResponse error(Exception e){
        e.printStackTrace();
        return ServerResponse.createByErrorCodeMessage(ResponseCode.INTERNAL_ERROR.getCode(),e.getMessage());
    }
}

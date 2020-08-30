package com.chenqiang.price.exception;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 20:31
 * @Description 英文异常
 */
public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}

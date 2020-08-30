package com.chenqiang.price.enums;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 22:05
 * @Description
 */
public enum ResultCodeType {
    SUCCESS(100,"成功"),
    ERROR(200,"失败")
    ;
    private int code;
    private String msg;

    ResultCodeType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

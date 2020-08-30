package com.chenqiang.price.common;

import com.chenqiang.price.enums.ResultCodeType;
import lombok.ToString;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 21:41
 * @Description 结果封装类
 */
@ToString
@SuppressWarnings("unchecked")
public class Result <T> {
    private T data;
    /**
     * 100成功
     * 200失败
     */
    private int code;
    private String desc;

    public Result(T data, int code, String desc) {
        this.data = data;
        this.code = code;
        this.desc = desc;
    }

    public static Result buildError(String desc){
        return new Result(null, ResultCodeType.ERROR.getCode(),desc);
    }

    public T getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}

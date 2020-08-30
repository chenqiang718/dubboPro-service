package com.chenqiang.price.enums;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 19:42
 * @Description 计算类型
 */
public enum CalculateType {
    ADD("addHandle","加法"),
    MULTIPLY("multiplyHandle","乘法")
    ;
    /**
     * 处理器名
     */
    private String name;
    /**
     * 描述
     */
    private String desc;

    CalculateType(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public static CalculateType getCalculateType(String name){
        if(name == null){
            return null;
        }
        for (CalculateType type:CalculateType.values()){
            if(type.name == name){
                return type;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}

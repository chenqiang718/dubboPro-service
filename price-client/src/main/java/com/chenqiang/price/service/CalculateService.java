package com.chenqiang.price.service;

import com.chenqiang.price.common.Result;
import com.chenqiang.price.entity.Price;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 19:19
 * @Description 计算服务
 */
public interface CalculateService {

    /**
     * 价格计算处理
     * @param a
     * @param b
     * @return
     */
    Result<Long> handle(Price a, Price b, String handle);
}

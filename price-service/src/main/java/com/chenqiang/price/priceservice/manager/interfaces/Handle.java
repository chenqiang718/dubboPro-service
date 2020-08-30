package com.chenqiang.price.priceservice.manager.interfaces;

import com.chenqiang.price.entity.Price;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 19:50
 * @Description
 */
public interface Handle {
    Long handle(Price a, Price b);
}

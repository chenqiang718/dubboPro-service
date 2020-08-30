package com.chenqiang.price.priceservice.manager.handle;

import com.chenqiang.price.entity.Price;
import com.chenqiang.price.enums.CalculateType;
import com.chenqiang.price.priceservice.manager.interfaces.Handle;
import org.springframework.stereotype.Component;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 20:12
 * @Description 乘法处理器
 */
@Component("multiplyHandle")
public class MultiplyHandle implements Handle {
    @Override
    public Long handle(Price a, Price b) {
        if (a.getSellPrice() == null){
            return b.getSellPrice();
        }
        if (b.getSellPrice() == null){
            return a.getSellPrice();
        }
        return a.getSellPrice() * b.getSellPrice();
    }
}

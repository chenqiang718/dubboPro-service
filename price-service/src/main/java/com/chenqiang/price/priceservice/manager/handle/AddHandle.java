package com.chenqiang.price.priceservice.manager.handle;

import com.chenqiang.price.entity.Price;
import com.chenqiang.price.enums.CalculateType;
import com.chenqiang.price.priceservice.manager.interfaces.Handle;
import org.springframework.stereotype.Component;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 19:47
 * @Description 加法处理器
 */
@Component("addHandle")
public class AddHandle implements Handle {

    @Override
    public Long handle(Price a, Price b) {
        if (a.getSellPrice() == null){
            return b.getSellPrice();
        }
        if (b.getSellPrice() == null){
            return a.getSellPrice();
        }
        return a.getSellPrice() + b.getSellPrice();
    }
}

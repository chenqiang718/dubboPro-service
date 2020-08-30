package com.chenqiang.price.priceservice.manager.handle.adapt;

import com.chenqiang.price.priceservice.manager.interfaces.Handle;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 20:14
 * @Description
 */
@Component
public class HandleAdapter {
    @Resource
    private ApplicationContext context;

    public Handle getHandle(String handleName) {
        Map<String, Handle> map = context.getBeansOfType(Handle.class);
        return map.get(handleName);
    }
}

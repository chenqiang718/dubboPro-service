package com.chenqiang.price.priceservice.service;

import com.chenqiang.price.common.Result;
import com.chenqiang.price.entity.Price;
import com.chenqiang.price.enums.CalculateType;
import com.chenqiang.price.enums.ResultCodeType;
import com.chenqiang.price.priceservice.manager.handle.adapt.HandleAdapter;
import com.chenqiang.price.priceservice.manager.interfaces.Handle;
import com.chenqiang.price.service.CalculateService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 19:23
 * @Description 价格服务
 */
@Service
public class CalculateServiceImpl implements CalculateService {
    @Resource
    HandleAdapter handleAdapter;
    @Override
    public Result<Long> handle(Price a, Price b, String handle) {
        if(a == null || b == null){
            return Result.buildError("price 参数不正确");
        }

        if (StringUtils.isEmpty(handle) || CalculateType.getCalculateType(handle) == null){
            return Result.buildError("handle 参数不正确");
        }

        Handle handleDeal = handleAdapter.getHandle(handle);
        return new Result<>(handleDeal.handle(a, b), ResultCodeType.SUCCESS.getCode(),"成功");
    }
}

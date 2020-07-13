package com.atguigu.springcloud.alibaba.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.alibaba.entities.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult hanlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义global hanlerException----1");
    }

    public static CommonResult hanlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义global hanlerException-----2");
    }
}

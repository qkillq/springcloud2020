package com.atguigu.springcloud.alibaba.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fallcack-paymentInfo_OK-------,(>﹏<。)～呜呜呜……";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "------PaymentFallbackService fallcack-paymentInfo_Timeout-------,(>﹏<。)～呜呜呜……";
    }
}

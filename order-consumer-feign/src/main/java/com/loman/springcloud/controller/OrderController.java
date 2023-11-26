package com.loman.springcloud.controller;

import com.loman.springcloud.entity.CommonResult;
import com.loman.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qmr
 * @date 2023/11/23
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") int id) {
        CommonResult result = paymentFeignService.getPaymentById(id);
        log.info("result={}", result);
        return result;
    }
}

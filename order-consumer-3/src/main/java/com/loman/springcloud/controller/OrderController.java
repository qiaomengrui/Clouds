package com.loman.springcloud.controller;

import com.loman.springcloud.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author qmr
 * @date 2023/11/18
 */
@RestController
@Slf4j
public class OrderController {

    private final String PAYMENT_SQL_URL = "http://payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/cs")
    public CommonResult getPaymentById() {
        log.info("------>getPaymentById ----consumer");
        String url = PAYMENT_SQL_URL + "/payment/cs";
        return restTemplate.getForObject(url, CommonResult.class);
    }
}

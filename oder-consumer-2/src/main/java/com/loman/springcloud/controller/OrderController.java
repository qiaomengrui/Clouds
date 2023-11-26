package com.loman.springcloud.controller;

import com.loman.springcloud.entity.CommonResult;
import com.loman.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author qmr
 * @date 2023/11/18
 */
@RestController
@Slf4j
public class OrderController {

//    private final String PAYMENT_SQL_URL = "http://localhost:8001";
    private final String PAYMENT_SQL_URL = "http://payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk/")
    public CommonResult getPaymentById() {
        String url = PAYMENT_SQL_URL + "/payment/zk/";
        return restTemplate.getForObject(url, CommonResult.class);
    }
}

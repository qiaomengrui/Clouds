package com.loman.springcloud.controller;

import com.loman.springcloud.entity.CommonResult;
import com.loman.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author qmr
 * @date 2023/11/18
 */
@RestController
@Slf4j
public class OrderController {

//    private final String PAYMENT_SQL_URL = "http://localhost:8001";
    private final String PAYMENT_SQL_URL = "http://PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id) {
        log.info("------>getPaymentById,id={}", id);
        String url = PAYMENT_SQL_URL + "/payment/get/" + id;
        return restTemplate.getForObject(url, CommonResult.class);
    }

    @PostMapping("/consumer/payment/create")
    public CommonResult create(Payment payment) {
        log.info("------>create,payment={}", payment);
        String url = PAYMENT_SQL_URL + "/payment/create";
        return restTemplate.postForObject(url, payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/zipkin")
    public CommonResult zipkin(){
        String url = PAYMENT_SQL_URL + "/payment/zipkin";
        return restTemplate.getForObject(url, CommonResult.class);
    }
}

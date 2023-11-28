package com.loman.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qmr
 * @date 2023/11/28
 */
@RestController
public class NacosController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/nacos/payment")
    public String paymentInfo() {
        return "nacos registry port: " + port;
    }
}

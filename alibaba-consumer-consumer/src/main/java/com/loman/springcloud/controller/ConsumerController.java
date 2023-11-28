package com.loman.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author qmr
 * @date 2023/11/28
 */
@RestController
public class ConsumerController {

    @Autowired
    public RestTemplate restTemplate;

    @Value("${server.port}")
    private int port;

    @Value("${service-url.nacos-user-service}")
    private String serverurl;

    @GetMapping("/consumer/nacos/payment")
    public String paymentInfo_OK(){
        String object = restTemplate.getForObject(serverurl + "/nacos/payment", String.class);
        return "支付成功，server-port：" + 8001 + " + " + object;
    }
}

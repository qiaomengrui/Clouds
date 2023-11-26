package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qmr
 * @date 2023/11/21
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启服务注册发现功能,使用consul、zookeeper时注册服务
public class PaymentMain3 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain3.class, args);
    }
}

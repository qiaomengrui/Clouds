package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qmr
 * @date 2023/11/21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain4 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain4.class, args);
    }
}

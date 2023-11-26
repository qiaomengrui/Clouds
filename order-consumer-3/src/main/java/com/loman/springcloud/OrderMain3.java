package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qmr
 * @date 2023/11/18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain3 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain3.class, args);
    }
}

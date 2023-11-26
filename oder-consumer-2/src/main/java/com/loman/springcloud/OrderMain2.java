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
public class OrderMain2 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain2.class, args);
    }
}

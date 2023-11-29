package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qmr
 * @date 2023/11/29
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SentinelMain {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMain.class, args);
    }
}

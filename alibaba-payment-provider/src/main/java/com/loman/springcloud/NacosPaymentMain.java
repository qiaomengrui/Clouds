package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qmr
 * @date 2023/11/28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain.class, args);
    }
}

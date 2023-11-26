package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qmr
 * @date 2023/11/23
 */
@SpringBootApplication
@EnableFeignClients
public class  OrderMain4 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain4.class, args);
    }
}

package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qmr
 * @date 2023/11/18
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain {
    public static void main(String[] args) {
        System.out.println("PaymentMain start...");
        SpringApplication.run(PaymentMain.class, args);
        System.out.println("PaymentMain end...");
    }
}

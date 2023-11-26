package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author qmr
 * @date 2023/11/20
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain2.class, args);
    }
}

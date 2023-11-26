package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author qmr
 * @date 2023/11/24
 */
@SpringBootApplication
@EnableHystrixDashboard  // http://localhost:9001/hystrix
public class HystrixDashMain {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashMain.class, args);
    }
}

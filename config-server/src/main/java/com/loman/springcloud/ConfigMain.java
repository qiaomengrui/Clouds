package com.loman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author qmr
 * @date 2023/11/27
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain.class, args);
    }
}

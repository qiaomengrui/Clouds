package com.loman.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qmr
 * @date 2023/11/28
 */
@RestController
@RefreshScope // 作用：配置文件的动态刷新。原生注解
public class NacosController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/nacos/payment/{id}")
    public String paymentInfo(@PathVariable("id") int id) {
        int i= 10/ id;
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "nacos registry port: " + port;
    }

//    @Value("${config.info}")
//    private String configInfo;

//    @GetMapping("/config/info")
//    public String getConfigInfo() {
//        return configInfo;
//    }

}

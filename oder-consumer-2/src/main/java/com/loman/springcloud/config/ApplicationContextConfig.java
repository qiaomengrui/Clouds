package com.loman.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author qmr
 * @date 2023/11/18
 */
@Configuration
public class ApplicationContextConfig {
    @Bean //applicationContext.getBean("restTemplate")  applicationContext.xml <bean id="restTemplate" class="org.springframework.web.client.RestTemplate"/>
    @LoadBalanced // 负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

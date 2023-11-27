package com.loman.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qmr
 * @date 2023/11/27
 */
@Configuration
public class gatewayConfig {

//    @Bean
//    public RouteLocator configure(RouteLocatorBuilder routeLocator) {
//        return routeLocator.routes()
//               .route(r -> r.path("/payment/get/**").uri("get://PAYMENT-SERVICE"))
//               .route(r -> r.path("/payment/create/**").uri("http://PAYMENT-SERVICE"))
//               .build();
//    }
}

package com.loman.springcloud.service;

import com.loman.springcloud.service.impl.SFeignServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(value = "nacos-payment-provider", fallback = SFeignServiceFallbackImpl.class)  //远程调用，fallback是容错机制
public interface SFeignService {

    @GetMapping("/nacos/payment/{id}") //restful风格
    public String getPaymentzipkin(@PathVariable("id") int id);

}

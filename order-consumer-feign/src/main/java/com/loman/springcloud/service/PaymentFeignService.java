package com.loman.springcloud.service;

import com.loman.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "PAYMENT-SERVICE")
public interface PaymentFeignService {

    /**
     * @param id id
     * @return common result
     */
    @GetMapping("/payment/get/{id}") //restful风格
    public CommonResult getPaymentById(@PathVariable("id") int id);

}

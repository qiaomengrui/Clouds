package com.loman.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.loman.springcloud.service.SFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qmr
 * @date 2023/11/29
 */
@RestController
public class SFController {

    @Autowired
    private SFeignService sfService;

    @GetMapping("/testa/payment/zipkin/{id}")
    @SentinelResource(value = "testa",
            blockHandlerClass = handlermy.class,
            blockHandler = "handlerFallback",
            fallback = "testaFallback")  //限流的fallback方法
    public String testa(@PathVariable("id") int id){
        if (id == 4){
            throw new RuntimeException("id=4 异常了");
        }

        return sfService.getPaymentzipkin(id) + " testA++";
    }

    public String testaFallback(@PathVariable("id") int id, Throwable e){  //参数要与上面的一致
        return "testA 异常了,"+ id;
    }

    /**
     * 参数一定要按照规则添加，否则不会匹配
     */
    public String testaHandler(@PathVariable("id") int id, BlockException blockException){  //参数要与上面的一致
        return "testA 限流了,"+ id;
    }
}

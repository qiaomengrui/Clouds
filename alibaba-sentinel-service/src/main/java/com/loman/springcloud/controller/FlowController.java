package com.loman.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.loman.springcloud.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qmr
 * @date 2023/11/29
 */
@RestController
public class FlowController {

    @GetMapping("/testA")
    public String testA(){
        return "testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "testB";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "blockHandler") // 限流
    public String testHotKey(@RequestParam("key") String key){
        return "testHotKey" + key;
    }

    public String blockHandler(String key, BlockException e){
        return "blockHandler" + key;
    }

    @GetMapping("/testcustomerKey")
    @SentinelResource(value = "testcustomerKey",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handleException2") // 限流
    public String testcustomerKey(){
        return "testcustomerKey";
    }

}

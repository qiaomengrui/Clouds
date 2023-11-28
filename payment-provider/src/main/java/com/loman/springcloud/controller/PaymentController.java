package com.loman.springcloud.controller;

import com.loman.springcloud.entity.CommonResult;
import com.loman.springcloud.entity.Payment;
import com.loman.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.Pipe;

/**
 * @author qmr
 * @date 2023/11/18
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private int port;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){  //@RequestBody 自动将json转化为对象
        log.info("请求服务端口{}", port);
        log.info("*****插入参数："+payment);
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if(result > 0){
            return CommonResult.valueOf(200,"插入数据库成功",result);
        }else{
            return CommonResult.valueOf(444,"插入数据库失败");
        }
    }

    @GetMapping("/payment/get/{id}") //restful风格
    public CommonResult getPaymentById(@PathVariable("id") int id){
        log.info("请求服务端口{}", port);
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if(payment!= null){
            return CommonResult.valueOf(200,"查询成功" + port,payment);
        }else{
            return CommonResult.valueOf(444,"查询失败");
        }
    }

    @GetMapping("/payment/zipkin")
    public CommonResult paymentZipkin(){
        log.info("请求zipkin服务端口{}", port);
        return CommonResult.valueOf(200,"hi,i am payment zipkin");
    }
}



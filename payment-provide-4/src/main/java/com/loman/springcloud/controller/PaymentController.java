package com.loman.springcloud.controller;

import com.loman.springcloud.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qmr
 * @date 2023/11/21
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/cs")
    public CommonResult paymentcs() {
        log.info("***** 正在调用paymentcs,serverPort: " + serverPort);
        return CommonResult.success("ok,serverPort: " + serverPort);
    }
}

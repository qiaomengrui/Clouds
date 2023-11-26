package springcloud.controller;

import com.loman.springcloud.entity.CommonResult;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springcloud.service.PaymentHystrixService;

/**
 * @author qmr
 * @date 2023/11/23
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentGlobalHandler")
public class OrderHystrixController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") int id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        log.info("result={}", result);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    })
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        log.info("*****result:{}",result);
        return result;
    }

    public String paymentTimeOutHandler(@PathVariable("id") Integer id){
        return "id= " + id + ", 服务超时了,请稍后再试";
    }

    @GetMapping("/consumer/payment/hystrix/timeout2/{id}")
    @HystrixCommand
    public String paymentInfo_TimeOut2(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        log.info("*****result:{}",result);
        return result;
    }

    public String paymentGlobalHandler(){
        return "global全局处理";
    }
}

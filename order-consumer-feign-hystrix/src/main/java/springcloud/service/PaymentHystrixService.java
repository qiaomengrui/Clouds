package springcloud.service;

import com.loman.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springcloud.fallback.PaymentHystrixServiceFallback;

@Component
@FeignClient(value = "PAYMENT-SERVICE", fallback = PaymentHystrixServiceFallback.class)
public interface PaymentHystrixService {

    /**
     * @param id id
     * @return common result
     */
    @GetMapping("/payment/hystrix/ok/{id}") //restful风格
    public String paymentInfo_OK(@PathVariable("id") int id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}

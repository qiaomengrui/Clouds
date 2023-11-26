package springcloud.fallback;

import org.springframework.stereotype.Component;
import springcloud.service.PaymentHystrixService;

/**
 * @author qmr
 * @date 2023/11/24
 */
@Component
public class PaymentHystrixServiceFallback implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(int id) {
        return "------fallback -- paymentInfo_OK, o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------fallback -- paymentInfo_TimeOut, o(╥﹏╥)o";
    }
}

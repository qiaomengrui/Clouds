package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qmr
 * @date 2023/11/23
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderMain5 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain5.class, args);
    }
}

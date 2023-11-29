package com.loman.springcloud.service.impl;

import com.loman.springcloud.service.SFeignService;
import org.springframework.stereotype.Component;

/**
 * @author qmr
 * @date 2023/11/29
 */
@Component
public class SFeignServiceFallbackImpl implements SFeignService {
    @Override
    public String getPaymentzipkin(int id) {
        return "远程调用失败";
    }
}

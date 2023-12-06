package com.loman.springcloud.controller;

import com.loman.springcloud.domain.Order;
import com.loman.springcloud.entity.CommonResult;
import com.loman.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qmr
 * @date 2023/12/2
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return CommonResult.success("订单完成");
    }

}

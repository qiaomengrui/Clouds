package com.loman.springcloud.service;

import com.loman.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    void create(Order order);
}

package com.loman.springcloud.dao;

import com.loman.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author qmr
 * @date 2023/12/1
 */
@Mapper
public interface OrderDao {

    void create(Order order);

    void update(@Param("userId") long userId, @Param("status") Integer status);
}

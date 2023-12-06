package com.loman.springcloud.service.Impl;

import com.loman.springcloud.dao.OrderDao;
import com.loman.springcloud.domain.Order;
import com.loman.springcloud.service.AccountService;
import com.loman.springcloud.service.OrderService;
import com.loman.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qmr
 * @date 2023/12/1
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional
    public void create(Order order) {
        log.info("--->新订单");
        orderDao.create(order);

//        log.info("--->库存减");
//        storageService.decrease(order.getProductId(), order.getCount());
//
//        log.info("--->余额减");
//        accountService.decrease(order.getUserId(), order.getMoney());

        log.info("--->改状态");
        orderDao.update(order.getUserId(), 0);

        log.info("--->订单结束");
    }
}

package com.loman.springcloud.service.Impl;

import com.loman.springcloud.dao.PaymentDao;
import com.loman.springcloud.entity.Payment;
import com.loman.springcloud.service.PaymentService;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qmr
 * @date 2023/11/18
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(int id){
        return paymentDao.getPaymentById(id);
    }
}

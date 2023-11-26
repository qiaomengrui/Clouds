package com.loman.springcloud.service;

import com.loman.springcloud.entity.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(int id);
}

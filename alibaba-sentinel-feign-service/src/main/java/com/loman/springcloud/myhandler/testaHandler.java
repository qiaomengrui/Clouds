package com.loman.springcloud.myhandler;

import org.springframework.stereotype.Component;

/**
 * @author qmr
 * @date 2023/11/29
 */
public class testaHandler {
    public String HandlerFallback() {
        return "服务不可用";
    }
}

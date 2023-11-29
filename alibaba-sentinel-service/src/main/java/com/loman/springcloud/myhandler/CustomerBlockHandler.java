package com.loman.springcloud.myhandler;

/**
 * @author qmr
 * @date 2023/11/29
 */
public class CustomerBlockHandler {

    public String handleException2(String msg, Throwable t) {
        System.out.println("自定义限流处理");
        return "自定义限流处理";
    }

}

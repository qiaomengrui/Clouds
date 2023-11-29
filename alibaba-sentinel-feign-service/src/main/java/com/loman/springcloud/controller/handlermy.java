package com.loman.springcloud.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author qmr
 * @date 2023/11/29
 */
@Slf4j
public class handlermy {
    public String handlerFallback(@PathVariable("id") int id, BlockException blockException) {
        log.info("服务不可用");
        return "服务不可用";
    }
}

package com.loman.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qmr
 * @date 2023/12/2
 */
@Configuration
@MapperScan({"com.loman.springcloud.dao"})
public class MybatisConfig {
}

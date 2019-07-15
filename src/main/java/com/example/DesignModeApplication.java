package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author jx
 * @date 2019/6/4 14:11
 * @return
 */
@SpringBootApplication
@MapperScan("com.example.m1_design_mode.mapper")
public class DesignModeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignModeApplication.class, args);
    }

}

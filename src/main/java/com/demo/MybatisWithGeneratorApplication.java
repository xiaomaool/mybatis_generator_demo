package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.demo.dao")
@SpringBootApplication
public class MybatisWithGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisWithGeneratorApplication.class, args);
    }
}

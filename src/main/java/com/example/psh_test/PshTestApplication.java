package com.example.psh_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.example.psh_test")
public class PshTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PshTestApplication.class, args);
    }

}

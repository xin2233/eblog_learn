package com.zjx.zblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.zjx.zblog.mapper")
@SpringBootApplication
public class ZblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZblogApplication.class, args);
        System.out.println("http://localhost:9999/");
    }

}

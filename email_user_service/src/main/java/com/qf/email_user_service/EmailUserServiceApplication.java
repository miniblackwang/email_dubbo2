package com.qf.email_user_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class EmailUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailUserServiceApplication.class, args);
    }

}

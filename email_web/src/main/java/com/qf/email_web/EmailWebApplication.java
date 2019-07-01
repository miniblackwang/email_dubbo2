package com.qf.email_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class EmailWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailWebApplication.class, args);
    }

}

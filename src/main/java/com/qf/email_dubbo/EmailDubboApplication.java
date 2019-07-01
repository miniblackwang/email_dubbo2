package com.qf.email_dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class EmailDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailDubboApplication.class, args);
    }

}

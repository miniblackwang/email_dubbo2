package com.qf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author miniblack
 * @version 1.0
 * @date 2019/6/30 0030 14:44
 */
public class ProviderRunner {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("provider start");
        System.in.read();
    }
}

package com.qf.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author miniblack
 * @version 1.0
 * @date 2019/6/30 0030 16:30
 */
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){

        return "index";
    }
}

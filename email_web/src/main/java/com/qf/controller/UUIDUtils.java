package com.qf.controller;

import java.util.UUID;

/**
 * @author miniblack
 * @version 1.0
 * @date 2019/6/30 0030 17:53
 */
public class UUIDUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}

package com.qf.controller;

import com.qf.entity.User;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author miniblack
 * @version 1.0
 * @date 2019/6/30 0030 16:26
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 注册
     */
    @RequestMapping(value = "/registerUser")
    public String register(User user){
        user.setStatus(0);
        String code = UUIDUtils.getUUID()+ UUIDUtils.getUUID();
        user.setCode(code);
        userService.register(user);
        return "success";
    }

    /**
     *校验邮箱中的code激活账户
     * 首先根据激活码code查询用户，之后再把状态修改为"1"
     */
    @RequestMapping(value = "/checkCode")
    public String checkCode(String code){
        User user = userService.checkCode(code);
        System.out.println(user);
        //如果用户不等于null，把用户状态修改status=1
        if (user !=null){
            user.setStatus(1);
            //把code验证码清空，已经不需要了
            user.setCode("");
            System.out.println(user);
            userService.updateUserStatus(user);
        }
        return "login";
    }

    /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/loginPage")
    public String login(){
        return "login";
    }

    /**
     * 登录
     */
    @RequestMapping(value = "/loginUser")
    public String login(User user, Model model){
        User u = userService.loginUser(user);
        if (u !=null){
            return "welcome";
        }
        return "login";
    }
}

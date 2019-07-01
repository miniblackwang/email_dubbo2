package com.qf.serviceimpl;

import com.qf.dao.UserMapper;
import com.qf.entity.User;
import com.qf.service.IUserService;
import com.qf.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author miniblack
 * @version 1.0
 * @date 2019/6/30 0030 13:49
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserService userService;

    @Autowired
    private MailService mailService;

    @Override
    public void register(User user) {
        userService.register(user);
        String code = user.getCode();
        System.out.println("code:"+code);
        //主题
        String subject = "来自天堂的激活邮件";
        //user/checkCode?code=code(激活码)是我们点击邮件链接之后根据激活码查询用户，如果存在说明一致，将用户状态修改为“1”激活
        //上面的激活码发送到用户注册邮箱
        String context = "<a href=\"/user/checkCode?code="+code+"\">激活请点击:"+code+"</a>";
        //发送激活邮件
        mailService.sendHtmlMail (user.getUseremail(),subject,context);
    }

    /**
     * 根据激活码code进行查询用户，之后再进行修改状态
     */
    @Override
    public User checkCode(String code) {

        return userService.checkCode(code);
    }

    /**
     * 激活账户，修改用户状态
     */
    @Override
    public void updateUserStatus(User user) {
        userService.updateUserStatus(user);
    }

    /**
     * 登录
     */
    @Override
    public User loginUser(User user) {
        User user1 = userService.loginUser(user);
        if (user1 !=null){
            return user1;
        }
        return null;
    }
}
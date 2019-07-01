package com.qf.service;
import com.qf.entity.User;

/**
 * @author miniblack
 * @version 1.0
 * @date 2019/6/30 0030 11:52
 */
public interface IUserService {

    /**
     * 用户注册,
     * @param user
     */
    void register(User user);

    /**
     * 根据激活码code查询用户，之后再进行修改状态
     * @param code
     * @return
     */
    User checkCode(String code);

    /**
     * 激活账户，修改用户状态为“1”
     * @param user
     */
    void updateUserStatus(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    User loginUser(User user);
}

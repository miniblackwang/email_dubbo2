package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.User;

/**
 * @author miniblack
 * @version 1.0
 * @date 2019/6/30 0030 14:05
 */
public interface UserMapper {

    /**
     * 用户注册
     */
    void register(User user);

    /**
     * 激活
     */
    User checkCode(String code);

    /**
     * 认证账户
     */
    void updateUserStatus(User user);

    /**
     * 登录，根据用户状态为来查询
     */
    User loginUser(User user);
}
package com.qf.service;

/**
 * @author miniblack
 * @version 1.0
 * @date 2019/6/30 0030 16:13
 */
public interface MailService {

    /**
     * 发送HTML邮件，方便用户点击附带的code用来验证激活账户
     *
     */
    void sendHtmlMail(String to, String subject, String content);

}
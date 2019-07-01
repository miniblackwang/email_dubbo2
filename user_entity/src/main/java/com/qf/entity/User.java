package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author miniblack
 * @version 1.0
 * @date 2019/6/30 0030 10:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private String useremail;
    /**
     * 状态：0代表未激活，1代表激活
     */
    private Integer status;
    private String  code;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", useremail='" + useremail + '\'' +
                ", status=" + status +
                ", code='" + code + '\'' +
                '}';
    }
}

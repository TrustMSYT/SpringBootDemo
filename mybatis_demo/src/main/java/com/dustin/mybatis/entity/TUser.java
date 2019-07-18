package com.dustin.mybatis.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 用户信息实体类
 * @Author:Dustin
 * @CreateDate:2019/7/18 17:00
 * @Version:1.0
 */
@Getter
@Setter
public class TUser {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

}

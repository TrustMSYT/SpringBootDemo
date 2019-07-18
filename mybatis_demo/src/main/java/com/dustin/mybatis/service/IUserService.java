package com.dustin.mybatis.service;

import com.dustin.mybatis.entity.TUser;
import com.fasterxml.jackson.databind.util.JSONPObject;

/**
 * @Description: 用户接口类
 * @Author:Dustin
 * @CreateDate:2019/7/18 17:34
 * @Version:1.0
 */

public interface IUserService {
    JSONPObject addUser(TUser user);
}

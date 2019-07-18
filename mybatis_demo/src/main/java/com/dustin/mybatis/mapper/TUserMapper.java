package com.dustin.mybatis.mapper;

import com.dustin.mybatis.entity.TUser;

import java.util.List;

/**
 * @Description: 用户Mapper接口类
 * @Author:Dustin
 * @CreateDate:2019/7/18 17:00
 * @Version:1.0
 */

public interface TUserMapper {
    /**
     * 保存用户信息
     *
     * @param user
     * @return
     */
    int addUser(TUser user);

    /**
     * 删除用户信息
     *
     * @param user
     * @return
     */
    int deleteUser(TUser user);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    int updateUser(TUser user);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    TUser findUserById(Integer id);

    /**
     * 获取用户集合
     * @return
     */
    List<TUser> queryUserList();
}

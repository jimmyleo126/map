package com.person.map.service.user;

import java.util.List;

import com.person.map.bean.User;


public interface UserService  {
	/**
     * 根据用户名查询用户结果集
     *
     * @param username 用户名
     * @return 查询结果
     */
    List<User> findByUsername();


    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 成功 1 失败 0
     */
    int insert(User user);
	

}

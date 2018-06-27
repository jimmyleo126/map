package com.person.map.dao;

import org.apache.ibatis.annotations.Mapper;

import com.person.map.bean.User;

@Mapper
public interface UserDao {

	int addUser(User user);
	
}

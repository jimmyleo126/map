package com.person.map.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.map.bean.User;
import com.person.map.dao.UserDao;
import com.person.map.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findByUsername( ) {
		return null;
	}

	@Override
	public int insert(User user) {
		return userDao.addUser(user);
	}

}

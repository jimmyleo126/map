package com.person.map.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.map.bean.User;
import com.person.map.service.user.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("nihao.do")
	public void getuser() {
		System.out.println("df");
	}
	
	@RequestMapping("adduser.do")
	public void addUSer(HttpServletRequest request, HttpServletResponse response) {
		userService.insert(new User("u1", "p1"));
	}

}

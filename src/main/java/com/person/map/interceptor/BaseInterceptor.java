package com.person.map.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class BaseInterceptor implements HandlerInterceptor {
	
	private static Logger logger = LoggerFactory.getLogger(BaseInterceptor.class);
	
	private static final String USER_AGENT = "user-agent";
	
	
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("7878");
		return true;
		
	}

}

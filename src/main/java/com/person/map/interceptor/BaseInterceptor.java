package com.person.map.interceptor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.person.map.bean.UserDomain;
import com.person.map.utils.IPKit;
import com.person.map.utils.TaleUtils;


@Component
public class BaseInterceptor implements HandlerInterceptor {
	
	private static Logger logger = LoggerFactory.getLogger(BaseInterceptor.class);
	
	private static final String USER_AGENT = "user-agent";
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		String uri = request.getRequestURI();
		//logger.info("UserAgent: {}", request.getHeader(USER_AGENT));
		logger.info("用户访问地址: {}, 来路地址: {}", uri, IPKit.getIpAddrByRequest(request));
		// 判断访问路径是否含有添加文章的方法名
		if (uri.indexOf("savecontent") > 0) {
			//如果有则通过request获取用户信息
			UserDomain user = TaleUtils.getLoginUser(request);
			if (user != null) {
				// 如果user对象不为空，表示用户已登录
				return true;
			} else {
				// 反之则表示用户未登录,跳转到登录页面
				try {
					request.getRequestDispatcher("/login.html").forward(request, response);
					return false;
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} 
		// 如果不包含此页面则直接跳过拦截器
		return true;
		
		
	}

}

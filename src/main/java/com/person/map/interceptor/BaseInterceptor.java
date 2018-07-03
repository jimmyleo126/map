package com.person.map.interceptor;

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
		
		
		UserDomain user = TaleUtils.getLoginUser(request);
		
		
		
		
		return true;
		
	}

}

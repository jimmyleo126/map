package com.person.map.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.person.map.bean.UserDomain;

public class TaleUtils {
	
	private static Logger logger = LoggerFactory.getLogger(TaleUtils.class);
	
	private static final int one_month = 30 * 24 * 60 * 60;
			
	public static UserDomain getLoginUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session == null) {
			return null;
		}
		return (UserDomain) session.getAttribute("");
	}

}

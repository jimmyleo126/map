package com.person.map.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.person.map.bean.ContentDomain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api("后台首页")
@Controller("adminIndexController")
@RequestMapping(value = "/admin")
public class IndexController {
	
	@ApiOperation("进入博客首页")
	@GetMapping("/")
	public String getindex() {
		
		return "blog/page/index";
	}
	
	@ApiOperation("添加文章")
	@GetMapping("savecontent")
	public String savecontent(
			@ApiParam(name = "titile", value = "标题", required = true)
			@RequestParam(name = "title", required = true) 
			String title, 
			@ApiParam(name = "titlePic", value = "标题图片", required = false)
			@RequestParam(name = "titlePic", value = "")
			@RequestParam String content,  HttpServletRequest request, HttpSession session) {
		ContentDomain cd = new 
		return null;
	}
	
	
	
	
	
	
}

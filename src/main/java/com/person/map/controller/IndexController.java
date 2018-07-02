package com.person.map.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.person.map.bean.ContentDomain;
import com.person.map.bean.User;
import com.person.map.bean.UserDomain;
import com.person.map.constant.Types;
import com.person.map.constant.WebConst;
import com.person.map.service.content.ContentService;
import com.person.map.utils.APIResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api("后台首页")
@Controller
public class IndexController {
	
	@Autowired
	private ContentService contentService; 
	
	@ApiOperation("进入博客首页")
	@GetMapping(value= {"/", "blog/page/index"})
	public String getindex(HttpServletRequest request, HttpSession session) {
		UserDomain user = (UserDomain) request.getSession().getAttribute(WebConst.LOGIN_SESSION_KEY);
		if(user == null)
			user = new UserDomain();
		user.setUsername("liuj");
		request.setAttribute("user", user);
		return "blog/page/index";
	}
	
	@ApiOperation("关于")
	@GetMapping("blog/page/about")
	public String about() {
		return "blog/page/about";
	}
	
	@ApiOperation("特点")
	@GetMapping("blog/page/features")
	public String features() {
		return "blog/page/features";
	}
	
	@ApiOperation("旅行")
	@GetMapping("blog/page/travel")
	public String travel() {
		return "blog/page/travel";
	}
	
	@ApiOperation("时尚")
	@GetMapping("blog/page/fashion")
	public String fashion() {
		return "blog/page/fashion";
	}
	
	@ApiOperation("音乐")
	@GetMapping("blog/page/music")
	public String music() {
		return "blog/page/music";
	}
	
	@ApiOperation("编码")
	@GetMapping("blog/page/codes")
	public String codes() {
		return "blog/page/codes";
	}
	
	@ApiOperation("联系我们")
	@GetMapping("blog/page/contact")
	public String contact() {
		return "blog/page/contact";
	}
	
	@ApiOperation("进入添加文章页")
	@GetMapping("addcontent")
	public String addcontent() {
		return "blog/page/addcontent";
	}
	
	
	@ApiOperation("添加文章")
	@GetMapping("savecontent")
	public APIResponse savecontent(
			@ApiParam(name = "titile", value = "标题", required = true)
			@RequestParam(name = "title", required = true) 
			String title, 
			@ApiParam(name = "titlePic", value = "标题图片", required = false)
			@RequestParam(name = "titlePic", required = false)
			String titlePic,
			@ApiParam(name = "slug", value = "内容缩略名", required = false)
			@RequestParam(name = "slug", required = false)
			String slug,
			@ApiParam(name = "content", value = "内容", required = true)
            @RequestParam(name = "content", required = true)
            String content,
            @ApiParam(name = "type", value = "文章类型", required = true)
            @RequestParam(name = "type", required = true)
            String type,
            @ApiParam(name = "status", value = "文章状态", required = true)
            @RequestParam(name = "status", required = true)
            String status,
            @ApiParam(name = "tags", value = "标签", required = false)
            @RequestParam(name = "tags", required = false)
            String tags,
            @ApiParam(name = "categories", value = "分类", required = false)
            @RequestParam(name = "categories", required = false, defaultValue = "默认分类")
            String categories,
            @ApiParam(name = "allowComment", value = "是否允许评论", required = true)
            @RequestParam(name = "allowComment", required = true)
            Boolean allowComment,
            HttpServletRequest request, HttpSession session) {
		
		ContentDomain contentDomain = new ContentDomain();
        contentDomain.setTitle(title);
        contentDomain.setTitlePic(titlePic);
        contentDomain.setSlug(slug);
        contentDomain.setContent(content);
        contentDomain.setType(type);
        contentDomain.setStatus(status);
        contentDomain.setTags(type.equals(Types.ARTICLE.getType()) ? tags : null);
        contentService.addContent(contentDomain);
		return APIResponse.success();
	}
	
	
	
	
	
	
}

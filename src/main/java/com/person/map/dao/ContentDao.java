package com.person.map.dao;

import org.apache.ibatis.annotations.Mapper;

import com.person.map.bean.ContentDomain;

@Mapper
public interface ContentDao {
	
	/**
	 * 添加文章
	 * @param contentDomain
	 */
	void addArticle(ContentDomain contentDomain);

}

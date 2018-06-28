package com.person.map.service.content.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.person.map.bean.ContentDomain;
import com.person.map.constant.ErrorConstant;
import com.person.map.dao.ContentDao;
import com.person.map.exception.BusinessException;
import com.person.map.service.content.ContentService;

@Service
public class ContentServiceImpl implements ContentService {
	
	@Autowired
	private ContentDao contentDao;

	@Transactional
	@Override
	public void addContent(ContentDomain contentDomain) {
		if(contentDomain == null)
			throw BusinessException.withErrorCode(ErrorConstant.Common.PARAM_IS_EMPTY);
		contentDao.addArticle(contentDomain);
		
	}

}

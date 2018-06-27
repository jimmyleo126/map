package com.person.map.constant;

public interface ErrorConstant {
	
	interface Common{
		static final String PARAM_IS_EMPTY = "参数为空";
        static final String INVALID_PARAM = "无效的参数";
        static final String CAN_NOT_FIND_PARAM_TO_CONTIUNE = "找不到参数继续运行";
	}
	
	interface Article{
		static final String ADD_NEW_ARTICLE_FAIL = "添加文章失败";
	}

}

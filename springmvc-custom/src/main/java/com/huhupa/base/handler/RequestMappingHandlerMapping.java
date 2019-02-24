package com.huhupa.base.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.huhupa.base.handlermethod.HandlerMethod;

public class RequestMappingHandlerMapping implements HandlerMapping {

	private Map<String, HandlerMethod> urlMapping = new HashMap<>();
	
	// 在本对象被创建的时候就去建立映射关系 
	public void init() {
		
	}
	
	@Override
	public Object getHandler(HttpServletRequest request) {
		HandlerMethod handlerMethod = urlMapping.get(request.getRequestURI());
		return handlerMethod;
	}

}

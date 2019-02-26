package com.huhupa.spring.factory;

import com.huhupa.base.handler.HandlerMapping;
import com.huhupa.base.handlermethod.HandlerMethod;

public interface HandlerMappingAdapter {
	
	HandlerMethod getHandlMethod(HandlerMapping handler);
	
	void suport();

}

package com.huhupa.base.handlermethod;

import java.lang.reflect.Method;

public class HandlerMethod {

	// UserHandler对象 
	private Object bean;
	
	private Class<?> beanType;
	
	private Method method;

	public Object getBean() {
		return bean;
	}

	public void setBean(Object bean) {
		this.bean = bean;
	}

	public Class<?> getBeanType() {
		return beanType;
	}

	public void setBeanType(Class<?> beanType) {
		this.beanType = beanType;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}
	
	
	
}

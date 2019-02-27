package com.huhupa.base;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import com.huhupa.base.handler.RequestMappingHandlerMapping;
import com.huhupa.base.handlermethod.HandlerMethod;
import com.huhupa.spring.factory.BeanFactory;
import com.huhupa.spring.factory.RuntimeBeanReference;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		String initParameter = config.getInitParameter("initFile");
		System.out.println("初始化：" + initParameter);
		RuntimeBeanReference.init(initParameter);
		super.init(config);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String uri = request.getRequestURI();
		HandlerMethod handler = getHandlerAdapter(uri);
		if (null != handler) {
			try {
				doHandlMethod(handler);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		} else {
			response.getWriter().write("没有找到处理器");
		}
		System.out.println("uri:" + uri);
//		if (handler instanceof AddUserHandler) {
//			response.getWriter().write(((AddUserHandler)handler).addUser());
//			;
//		} else if (handler instanceof QueryUserHandler) {
//			response.getWriter().write(((QueryUserHandler)handler).queryUser());
//		} else {
//			response.getWriter().write("没有找到处理器");
//		}
	}
	private void doHandlMethod(HandlerMethod handler) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> beanType = handler.getBeanType();
		Method method = handler.getMethod();
		method.invoke(BeanFactory.getBean(beanType));
	}

	private HandlerMethod getHandlerAdapter(String uri) {
		if (StringUtils.isBlank(uri)) {
			return null;
		}
		HandlerMethod handlerMethod = RequestMappingHandlerMapping.urlMapping.get(uri);
		if (handlerMethod != null) {
			return handlerMethod;
		}
		if (uri.startsWith("/")) {
			uri = uri.substring(0, 1);
		}
		handlerMethod = RequestMappingHandlerMapping.urlMapping.get(uri);
		if (handlerMethod != null) {
			return handlerMethod;
		}
		return null;
	}

	private Object getHandler(String uri) {
		if ("/addUser".equals(uri)) {
			return BeanFactory.getBean("addUser");
		} else if ("/queryUser".equals(uri)) {
			return BeanFactory.getBean("queryUser");
		}
		return null;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

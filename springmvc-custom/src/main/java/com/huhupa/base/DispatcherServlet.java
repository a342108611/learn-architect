package com.huhupa.base;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huhupa.base.handler.AddUserHandler;
import com.huhupa.base.handler.QueryUserHandler;
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
		Object handler = getHandler(uri);
		System.out.println("uri:" + uri);
		if (handler instanceof AddUserHandler) {
			response.getWriter().write(((AddUserHandler)handler).addUser());
			;
		} else if (handler instanceof QueryUserHandler) {
			response.getWriter().write(((QueryUserHandler)handler).queryUser());
		} else {
			response.getWriter().write("没有找到处理器");
		}
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

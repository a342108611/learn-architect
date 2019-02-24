package com.huhupa.spring.test;

import com.huhupa.spring.factory.BeanFactory;
import com.huhupa.spring.factory.RuntimeBeanReference;
import com.huhupa.spring.service.UserService;

public class XmlReaderTest {

	public static void main(String[] args) {
		RuntimeBeanReference.init("src/main/resources/spring.xml");
		System.out.println("Ö´ÐÐÍê±Ï");
		UserService bean = (UserService)BeanFactory.getBean("userService");
		bean.addUser();
	}
}

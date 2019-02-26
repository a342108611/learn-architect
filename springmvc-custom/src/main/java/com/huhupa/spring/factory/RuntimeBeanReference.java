package com.huhupa.spring.factory;

import org.dom4j.DocumentException;

public class RuntimeBeanReference {
	
	public static void init(String path) {
		XmlReader xmlReader = new XmlReader();
		try {
			// 解析xml将bean信息存储到beanDifinition中
			xmlReader.parse(xmlReader.readDocument(path));
			// 根据beanDefinition信息创建bean
			BeanFactory.init();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
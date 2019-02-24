package com.huhupa.spring.factory;

import org.dom4j.DocumentException;

public class RuntimeBeanReference {
	
	public static void init(String path) {
		XmlReader xmlReader = new XmlReader();
		try {
			// ����xml��bean��Ϣ�洢��beanDifinition��
			xmlReader.parse(xmlReader.readDocument(path));
			// ����beanDefinition��Ϣ����bean
			BeanFactory.init();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}

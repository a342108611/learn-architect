package com.huhupa.spring.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import com.huhupa.base.annotation.Controller;
import com.huhupa.common.utils.ClazzUtil;

/**
 * ����xml�ļ�
 * @author Administrator
 *
 */
public class XmlReader {
	
	public Document readDocument(String path) throws DocumentException {
		Document document = new SAXReader().read(path);
		return document;
	}

	public void parse(Document document) {
		Element rootElement = document.getRootElement();
		List<Element> elements = rootElement.elements();
		for (Element element : elements) {
			if ("bean".equals(element.getName())) {
				parseDefaultElement(element);
			} else if("component-scan".equals(element.getName())) {
				parseComponentScanElement(element);
			}
		}
		
	}

	private void parseComponentScanElement(Element element) {
		String attributeValue = element.attributeValue("package");
		List<String> clazzNames = ClazzUtil.getClazzName(attributeValue, true);
		for (String clazzName : clazzNames) {
			if (determineWhetherAnnotated(clazzName)) {
				Map<String, Object> beanDefinition = new HashMap<String, Object>();
				beanDefinition.put("class", clazzName);
				beanDefinition.put("name", clazzName.substring(clazzName.lastIndexOf(".")));
				GenericBeanDifinition.addBeanDefinition(beanDefinition);
			}
		}
		
	}

	private boolean determineWhetherAnnotated(String clazzName) {
		if (StringUtils.isNotBlank(clazzName)){
			try {
				Class<?> clazz = Class.forName(clazzName);
				if (clazz.isAnnotationPresent(Controller.class)) {
					return true;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
		return false;
	}

	private void parseDefaultElement(Element element) {
		Map<String, Object> beanDefinition = new HashMap<String, Object>();
		String id = element.attributeValue("id");
		String name = element.attributeValue("name");
		if (StringUtils.isBlank(name)) {
			name = id;
		}
		String classValue = element.attributeValue("class");
		if (StringUtils.isBlank(name)) {
			name = classValue.substring(classValue.lastIndexOf(".") + 1, classValue.length());
		}
		beanDefinition.put("id", id);
		beanDefinition.put("name", name);
		beanDefinition.put("class", classValue);
		GenericBeanDifinition.addBeanDefinition(beanDefinition);
	}

//	private void parseBean(List<Element> selectNodes) {
//		if (null != selectNodes && !selectNodes.isEmpty()) {
//			for (Element element : selectNodes) {
//				Map<String, Object> beanDefinition = new HashMap<String, Object>();
//				String id = element.attributeValue("id");
//				String name = element.attributeValue("name");
//				if (StringUtils.isBlank(name)) {
//					name = id;
//				}
//				String classValue = element.attributeValue("class");
//				if (StringUtils.isBlank(name)) {
//					name = classValue.substring(classValue.lastIndexOf(".") + 1, classValue.length());
//				}
//				beanDefinition.put("id", id);
//				beanDefinition.put("name", name);
//				beanDefinition.put("class", classValue);
//				GenericBeanDifinition.addBeanDefinition(beanDefinition);
//			}
//		}
//	}
}

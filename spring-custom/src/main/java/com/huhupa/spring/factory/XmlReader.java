package com.huhupa.spring.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.huhupa.spring.annotation.Component;
import com.huhupa.spring.utils.ClazzUtil;

/**
 * 解析xml文件
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
			} else if ("component-scan".equals(element.getName())) {
				try {
					parseComponentScanElement(element);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void parseComponentScanElement(Element element) throws ClassNotFoundException {
		String packageName = element.attributeValue("package");
		if (StringUtils.isNotBlank(packageName)) {
			List<String> clazzNames = ClazzUtil.getClazzName(packageName, true);
			for (String clazzName : clazzNames) {
				if (isWhetherAnnotated(clazzName)) {
					Map<String, Object> beanDefinition = new HashMap<String, Object>();
					beanDefinition.put("name", clazzName.substring(clazzName.lastIndexOf(".")));
					beanDefinition.put("class", clazzName);
					GenericBeanDifinition.addBeanDefinition(beanDefinition);
				}
			}
		}
		
	}

	private boolean isWhetherAnnotated(String clazzName) throws ClassNotFoundException {
		if (StringUtils.isNotBlank(clazzName)) {
			Class<?> forName = Class.forName(clazzName);
			if (forName.isAnnotationPresent(Component.class)) {
				return true;
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
			name = classValue.substring(classValue.lastIndexOf(".") + 1);
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

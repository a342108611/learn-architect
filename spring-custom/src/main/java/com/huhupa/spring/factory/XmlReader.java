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

/**
 * ½âÎöxmlÎÄ¼þ
 * @author Administrator
 *
 */
public class XmlReader {
	
	public Document readDocument(String path) throws DocumentException {
		Document document = new SAXReader().read(path);
		return document;
	}

	public void parse(Document document) {
		List<Element> selectNodes = document.selectNodes("/beans/bean");
		parseBean(selectNodes);
	}

	private void parseBean(List<Element> selectNodes) {
		if (null != selectNodes && !selectNodes.isEmpty()) {
			for (Element element : selectNodes) {
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
		}
	}
}

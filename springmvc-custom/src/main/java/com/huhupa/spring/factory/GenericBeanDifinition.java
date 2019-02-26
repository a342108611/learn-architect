package com.huhupa.spring.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericBeanDifinition {
	
	public static List<Map<String, Object>> beanDefinitions = new ArrayList<>();
	
	public static void addBeanDefinition(Map<String, Object> beanDefinition) {
		beanDefinitions.add(beanDefinition);
	}

}

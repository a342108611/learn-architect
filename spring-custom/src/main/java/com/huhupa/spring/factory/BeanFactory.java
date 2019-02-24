package com.huhupa.spring.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanFactory {
	
	private static Map<String, Object> beansOfNamesMap = new HashMap<String, Object>();
	private static Map<Class<?>, Object> beansOfClassTypeMap = new HashMap<Class<?>, Object>();

	public static void init() {
		List<Map<String, Object>> beanDefinitions = GenericBeanDifinition.beanDefinitions;
		if (null != beanDefinitions && !beanDefinitions.isEmpty()) {
			for (Map<String, Object> map : beanDefinitions) {
				genericBean(map);
			}
		}
	}
	
	private static void genericBean(Map<String, Object> map) {
		String name = map.get("name").toString();
		String clazz = map.get("class").toString();
		try {
			Object newInstance = Class.forName(clazz).newInstance();
			beansOfNamesMap.put(name, newInstance);
			beansOfClassTypeMap.put(newInstance.getClass(), newInstance);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Object getBean(String beanName) {
		return beansOfNamesMap.get(beanName);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static Object getBean(Class<?> clazz) {
		return beansOfClassTypeMap.get(clazz);
	}
}

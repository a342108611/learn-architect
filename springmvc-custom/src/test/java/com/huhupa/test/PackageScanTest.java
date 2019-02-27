package com.huhupa.test;

import java.util.List;

import com.huhupa.common.utils.ClazzUtil;

public class PackageScanTest {

	public static void main(String[] args) {
		List<String> clazzNames = ClazzUtil.getClazzName("com.huhupa.base", true);
		for (String clazzName : clazzNames) {
			System.out.println("clazzName:" + clazzName);
		}

	}

}

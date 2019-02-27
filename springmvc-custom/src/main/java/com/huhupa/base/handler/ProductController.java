package com.huhupa.base.handler;

import com.huhupa.base.annotation.Controller;
import com.huhupa.base.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("findProduct")
	public String findProduct() {
		System.out.println("findProduct");
		return "findProduct";
	}
}

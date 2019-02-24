package com.huhupa.base.handler;

import com.huhupa.base.annotation.Controller;
import com.huhupa.base.annotation.RequestMapping;

@Controller
public class UserHandler {
	
	@RequestMapping("/findUser")
	public String findUser() {
		System.out.println("UserHandler.findUser()");
		return "查找用户";
	}

}

package com.huhupa.base.handler;

import com.huhupa.base.annotation.Controller;
import com.huhupa.base.annotation.RequestMapping;

@Controller
public class UserHandler {
	
	@RequestMapping("/deleteUser")
	public String deleteUser() {
		System.out.println("UserHandler.findUser()");
		return "删除用户";
	}

}

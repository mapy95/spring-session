package com.session.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {

    //模拟第一次登陆时，保存session
	@RequestMapping(value="/setSession")
	public String setSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String str = (String) session.getAttribute("userInfo");
		if(str == null || "".equals(str)) {
			session.setAttribute("userInfo", "mpy test session");
		}
		return "success";
	}

	@RequestMapping(value="/getSession")
	public String getSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String str = (String) session.getAttribute("userInfo");
		if(str == null || "".equals(str)) {
			return "session中没有数据，请登录";
		}
		System.out.println("session中的属性是:"+str);
		return str;
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String str = (String) session.getAttribute("userInfo");
		if(str != null && "".equals(str)) {
			session.invalidate();
		}
		return "退出成功";
	}
}

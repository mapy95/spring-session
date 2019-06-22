package com.session.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {

    //模拟第一次登陆时，保存session
	@RequestMapping(value="/login")
	public String login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String str = (String) session.getAttribute("userInfo");
		if(str == null || "".equals(str)) {
			session.setAttribute("userInfo", "mpy test session");
            return "用户登录成功-success";
        }else{
            return "session中存在数据，用户已登录";
        }
	}

	//该方法模式登陆之后，调用业务接口
	@RequestMapping(value="/getSession")
	public String getSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String str = (String) session.getAttribute("userInfo");
		if(str == null || "".equals(str)) {
			return "session中没有数据，请登录";
		}else{
		    //已登录用户，进行其他业务代码的处理
		    System.out.println("session中的属性是:"+str);
            return str;
        }
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

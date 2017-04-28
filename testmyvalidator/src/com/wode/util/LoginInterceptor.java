package com.wode.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.wode.pojo.UserBean;


public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean flag=false;
		HttpSession session=request.getSession();
		UserBean bean=(UserBean) session.getAttribute("user");
		if(bean!=null){
			flag=true;
			System.out.println("preHandle"+bean.getUserName());
		}else{
			response.sendRedirect("login2.jsp");
		}
		return flag;
	}


}

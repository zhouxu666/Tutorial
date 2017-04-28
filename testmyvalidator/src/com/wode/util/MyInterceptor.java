package com.wode.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wode.pojo.UserBean;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("方法执行之后视图生成之前拦截");
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("方法执行之后拦截");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("方法执行之前拦截");
		//ture--接着执行  false 停止执行
		//session 中如果没有用户信息 就重定向到登录页面
//		boolean flag=false;
//		HttpSession session=request.getSession();
//		UserBean bean=(UserBean) session.getAttribute("user");
//		if(bean!=null){
//			flag=true;
//			System.out.println("preHandle"+bean.getUserName());
//		}else{
//			response.sendRedirect("login2.jsp");
//		}
		return true;
	}

}

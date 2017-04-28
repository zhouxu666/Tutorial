package com.wode.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wode.pojo.UserBean;


@Controller
public class UserController {
	@RequestMapping(path="/login2",method=RequestMethod.POST)
	public ModelAndView login(@Valid UserBean user,BindingResult br){
		ModelAndView mav=new ModelAndView();
		if(br.hasErrors()){
			mav.setViewName("login2");
			System.out.println("hello error");
			return mav;
		}
		mav.setViewName("main");
		
		mav.addObject("user",user.getUserName());
		System.out.println(user.getUserName());
		return mav;
	}
}

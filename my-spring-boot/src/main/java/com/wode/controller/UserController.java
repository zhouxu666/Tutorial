package com.wode.controller;

import com.wode.bean.User;
import com.wode.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 
 */
@Controller
public class UserController {
    @Resource(name = "userServiceImpl")
    private UserService userService;
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/loginPapge")
    public String loginPapge(){
        return "login";
    }

    @PostMapping("/userLogin")
    public String userLogin(String name,String pwd, HttpSession session){
        User user=userService.login(name,pwd);
        System.out.print(user);
        if(user!=null){
            session.setAttribute("user",user);
            return "main";
        }else {
            return "loginFail";
        }
    }
    @GetMapping("/showUserPapge")
    public ModelAndView showUserPapge(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("userPapge/user");
        List<User> users=userService.findAllUser();
//        mav.addObject(users);
        mav.addObject("users",users);
        return mav;
    }
}

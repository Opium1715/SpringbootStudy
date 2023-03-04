package com.springboot.zq.controller;

import com.springboot.zq.pojo.User;
import com.springboot.zq.servicce.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping(value = {"/", "/login"})
    public String login(){
        return "login";
    }


    @PostMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request){
        if (userService.judgeUser(user)){
            HttpSession session = request.getSession();
            session.setAttribute("User",user);
        }
        //重定向到index
        //防止表单重复提交
        //浏览器再次刷新请求URL是”/index“
        return new ModelAndView("redirect:index");
    }

    @GetMapping("/index")
    public String DisplayIndex(){
        return "index";
    }




    /*@GetMapping("/index")
    public String index(HttpServletRequest request){
        if (request.getSession().getAttribute("User")!=null){
            return "index";
        }
        else {
            return "redirect:login";
        }
    }*/
//
}

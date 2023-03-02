package com.springboot.zq.controller;

import com.springboot.zq.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class LoginController {
    @GetMapping(value = {"/", "/login"})
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request){
        /*String ID = (String) loginModel.getAttribute("ID");
        String PassWord = (String) loginModel.getAttribute("PassWord");*/
        /*log.info("账号和密码是： "+user.getNo()+" "+user.getPassWord());*/
        HttpSession session = request.getSession();
        session.setAttribute("User",user);
        //重定向到index
        //防止表单重复提交
        //浏览器再次刷新请求URL是”/index“
        return new ModelAndView("redirect:index");
    }

    @GetMapping("/index")
    public String index(HttpServletRequest request){
        if (request.getSession().getAttribute("User")!=null){
            return "index";
        }
        else {
            return "redirect:login";
        }
    }
//
}

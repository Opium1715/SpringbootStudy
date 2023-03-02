package com.springboot.zq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/*@Slf4j
@RestController
public class HelloController {
//    @Autowired
//    User user1;

    @RequestMapping("/hello")
    public User hello(){
        User user = new User(1,"haha");
//        log.info(user1.getNo());
        log.info("mapping to '/hello'");
        return user;
    }

    @RequestMapping("/user/{id}/{name}")
    public User getUser(@PathVariable Map<String,String> pv, @RequestHeader Map<String,String> rh){
        Map<String,Object> map =new HashMap<>();
        User user = new User();
        user.setNo(Integer.valueOf(pv.get("id")));
        user.setName(pv.get("name"));
        log.info(user.toString());
//        map.put("pathV",pv);
//        map.put("rheader",rh);
        return user;
    }


    @PostMapping("/user")
    public Map<String, String> userjson(@RequestBody Map<String,String> body){
        log.info(body.get("code"));
//        log.info(user.toString());
        return body;
    }

    @GetMapping("/render")
    public ModelAndView getViewTest(){
        User user = new User(2007310451,"zq");
        return new ModelAndView("test","user",user);
    }

}*/

package com.springboot.zq.controller;

import com.springboot.zq.pojo.Category;
import com.springboot.zq.pojo.User;
import com.springboot.zq.servicce.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
public class TestController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/jsonTest")
    public ModelAndView JsonTest(HttpServletRequest request){
        //just for test
        User user = (User) request.getSession().getAttribute("User");
        log.info(user.toString());
        return new ModelAndView("test","user",user);
    }

    @GetMapping("/form")
    public ModelAndView form(){
        return new ModelAndView("form/form_layouts");
    }

    @PostMapping("/form")
    public ModelAndView upload(MultipartFile image, String email, String password, MultipartFile[] photos, HttpSession session) throws IOException {

        String uploadPath = session.getServletContext().getRealPath("static/upload")+ File.separator + "image";
        if (image!=null){
            log.info(image.getSize()+" "+email+" "+password+" "+ photos.length);
            String originalFilename = image.getOriginalFilename();
            assert originalFilename != null;
            String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            originalFilename = UUID.randomUUID()+fileSuffix;
            File file = new File(uploadPath);
            if (!file.exists()){
                boolean mkdir = file.mkdirs();
                if (mkdir) log.info("初始创建文件夹成功！");
            }
            String finalPath = uploadPath+File.separator+originalFilename;
            image.transferTo(new File(finalPath));
        }
        return new ModelAndView("redirect:form");
    }

    @GetMapping("/testError5xx")
    public int test5xx(){
        return 5/0;
    }

}

package com.springboot.zq.controller;


import com.springboot.zq.pojo.Category;
import com.springboot.zq.servicce.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Slf4j
@RestController
public class DevController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/category")
    public Map<String,List<Category>> getCategory(){
        log.info("查询分类目录测试");
        List<Category> categoryData = categoryService.getAllCategory(1).getList();
        List<Category> categoryList = categoryService.getCategoryParent();
        HashMap<String,List<Category>> hashMap = new HashMap<>();
        hashMap.put("categoryData",categoryList);
        hashMap.put("categoryData_2",categoryData);
        return hashMap;
    }
}

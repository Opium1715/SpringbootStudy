package com.springboot.zq.servicce.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.zq.mapper.CategoryMapper;
import com.springboot.zq.pojo.Category;
import com.springboot.zq.servicce.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {
   @Autowired
   CategoryMapper categoryMapper;

    @Override
    public PageInfo<Category> getAllCategory(Integer pageNo) {
        PageHelper.startPage(pageNo,20);
        List<Category> categoryList = categoryMapper.selectAll();
        log.info(categoryList.toString());
        return new PageInfo<>(categoryList);
    }
    @Override
    public List<Category> getCategoryParent(){
        return categoryMapper.selectParentCategory();
    }

}

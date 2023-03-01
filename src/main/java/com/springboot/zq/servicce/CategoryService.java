package com.springboot.zq.servicce;

import com.github.pagehelper.PageInfo;
import com.springboot.zq.pojo.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    PageInfo<Category> getAllCategory(Integer pageNo);
    PageInfo<Category> getAllbyAnnotation(Integer pageNo);
}

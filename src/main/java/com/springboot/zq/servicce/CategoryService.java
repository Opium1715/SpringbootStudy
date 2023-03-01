package com.springboot.zq.servicce;

import com.github.pagehelper.PageInfo;
import com.springboot.zq.pojo.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    PageInfo<Category> getAllCategory(Integer pageNo);


    List<Category> getCategoryParent();
}

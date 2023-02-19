package com.springboot.zq.mapper;

import com.springboot.zq.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface CategoryMapper {
    int deleteByPrimaryKey(String contentId);

    int insert(Category record);

    Category selectByPrimaryKey(String contentId);

    List<Category> selectAll();
    @Select("select * from category")
    List<Category> selectAllByAnnotation();

    int updateByPrimaryKey(Category record);
}
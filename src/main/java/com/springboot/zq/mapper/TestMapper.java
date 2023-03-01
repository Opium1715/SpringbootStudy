package com.springboot.zq.mapper;

import com.springboot.zq.pojo.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestMapper {
    int insert(Test record);

    List<Test> selectAll();
}
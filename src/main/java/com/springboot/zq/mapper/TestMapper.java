package com.springboot.zq.mapper;

import com.springboot.zq.pojo.Test;
import java.util.List;

public interface TestMapper {
    int insert(Test record);

    List<Test> selectAll();
}
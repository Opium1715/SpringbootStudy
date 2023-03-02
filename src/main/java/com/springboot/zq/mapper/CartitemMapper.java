package com.springboot.zq.mapper;

import com.springboot.zq.pojo.Cartitem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CartitemMapper {
    int deleteByPrimaryKey(Integer cartitemId);

    int insert(Cartitem record);

    Cartitem selectByPrimaryKey(Integer cartitemId);

    List<Cartitem> selectAll();

    int updateByPrimaryKey(Cartitem record);
}
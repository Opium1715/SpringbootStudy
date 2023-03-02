package com.springboot.zq.mapper;

import com.springboot.zq.pojo.Orderitem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderitemMapper {
    int deleteByPrimaryKey(Integer orderdetailId);

    int insert(Orderitem record);

    Orderitem selectByPrimaryKey(Integer orderdetailId);

    List<Orderitem> selectAll();

    int updateByPrimaryKey(Orderitem record);
}
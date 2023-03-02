package com.springboot.zq.mapper;

import com.springboot.zq.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    Order selectByPrimaryKey(Integer orderId);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}
package com.springboot.zq.mapper;

import com.springboot.zq.pojo.Merchant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MerchantMapper {
    int deleteByPrimaryKey(Integer mercId);

    int insert(Merchant record);

    Merchant selectByPrimaryKey(Integer mercId);

    List<Merchant> selectAll();

    int updateByPrimaryKey(Merchant record);
}
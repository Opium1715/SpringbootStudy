package com.springboot.zq.mapper;

import com.springboot.zq.pojo.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(Address record);

    Address selectByPrimaryKey(Integer addressId);

    List<Address> selectAll();

    int updateByPrimaryKey(Address record);

}

package com.springboot.zq.mapper;

import com.springboot.zq.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    User selectByPrimaryKey(Integer userId);

    User selectByUserName(String userName);
    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
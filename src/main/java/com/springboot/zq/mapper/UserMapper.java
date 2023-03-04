package com.springboot.zq.mapper;

import com.springboot.zq.pojo.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    User selectByPrimaryKey(Integer userId);


    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
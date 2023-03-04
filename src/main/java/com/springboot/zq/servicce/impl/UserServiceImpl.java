package com.springboot.zq.servicce.impl;

import com.springboot.zq.mapper.UserMapper;
import com.springboot.zq.pojo.User;
import com.springboot.zq.servicce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean judgeUser(User user) {
        User user1 = userMapper.selectByPrimaryKey(user.getUserId());
        return user1 != null && user1.getUserPassword().equals(user.getUserPassword());
    }
}

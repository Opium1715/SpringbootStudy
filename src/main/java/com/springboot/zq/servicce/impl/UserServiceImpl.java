package com.springboot.zq.servicce.impl;

import com.springboot.zq.mapper.UserMapper;
import com.springboot.zq.pojo.User;
import com.springboot.zq.servicce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean judgeUser(User user) {
        User user1 = userMapper.selectByUserName(user.getUserName());
        return user1 != null && user1.getUserPassword().equals(user.getUserPassword());
    }

    @Transactional(rollbackFor = {java.lang.Exception.class})
    @Override
    public void registerUser(User user){
        userMapper.insert(user);
    }
}

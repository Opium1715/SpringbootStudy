package com.springboot.zq.servicce;

import com.springboot.zq.pojo.User;

public interface UserService {

    boolean judgeUser(User user);

    void registerUser(User user) throws Exception;
}

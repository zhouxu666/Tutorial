package com.wode.service;

import com.wode.bean.User;

import java.util.List;

/**
 * Created by 
 */
public interface UserService {
    public User login(String name, String pwd);
    public List<User> findAllUser();
}

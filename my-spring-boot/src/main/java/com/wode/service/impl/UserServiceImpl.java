package com.wode.service.impl;

import com.wode.bean.User;
import com.wode.dao.UserDao;
import com.wode.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    @Override
    public User login(String name, String pwd) {
        return userDao.findUserByUserNameAndUserPwd(name,pwd);
    }
}


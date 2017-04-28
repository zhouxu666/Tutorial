package com.wode.dao;

import com.wode.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by
 */
public interface UserDao extends JpaRepository<User,Integer> {
    public User findUserByUserNameAndUserPwd(String name, String pwd);
}

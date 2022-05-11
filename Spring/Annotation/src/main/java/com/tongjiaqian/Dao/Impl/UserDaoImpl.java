package com.tongjiaqian.Dao.Impl;

import com.tongjiaqian.Dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Value("${username1}")
    private String username;
    @Override
    public void save() {
        System.out.println("UserDao..."+username);
    }
}

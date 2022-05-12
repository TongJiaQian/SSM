package com.tongjiaqianmybatis.Service.Impl;

import com.tongjiaqianmybatis.Dao.UserDao;
import com.tongjiaqianmybatis.Service.UserService;
import com.tongjiaqianmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //引用类型注入
    @Autowired
    public UserDao userDao ;

    @Override
    public void showAllUser() {
        System.out.println("UserService Start...");
        List<User> users = userDao.selectAll();
        System.out.println(users);
    }

    @Override
    public void showUserById(Integer id) {
        System.out.println("UserService Start...");
        User user = userDao.selectById(id);
        System.out.println(user);
    }
}

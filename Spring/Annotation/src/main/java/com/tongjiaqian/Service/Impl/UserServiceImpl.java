package com.tongjiaqian.Service.Impl;

import com.tongjiaqian.Dao.BookDao;
import com.tongjiaqian.Dao.Impl.BookDaoImpl;
import com.tongjiaqian.Dao.Impl.UserDaoImpl;
import com.tongjiaqian.Dao.UserDao;
import com.tongjiaqian.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    //引用类型注入
    @Autowired
    public BookDao bookDao ;
    @Autowired
    public UserDao userDao ;

    @Override
    public void save() {
        System.out.println("UserService...");
        bookDao.save();
        userDao.save();
    }
}

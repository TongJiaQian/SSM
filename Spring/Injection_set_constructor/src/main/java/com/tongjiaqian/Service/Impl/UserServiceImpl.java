package com.tongjiaqian.Service.Impl;

import com.tongjiaqian.Dao.BookDao;
import com.tongjiaqian.Dao.Impl.BookDaoImpl;
import com.tongjiaqian.Dao.Impl.UserDaoImpl;
import com.tongjiaqian.Dao.UserDao;
import com.tongjiaqian.Service.UserService;

public class UserServiceImpl implements UserService {
    //引用类型注入
    public BookDao bookDao ;
    public UserDao userDao ;

    //引用类型setter方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("UserService...");
        bookDao.save();
        userDao.save();
    }
}

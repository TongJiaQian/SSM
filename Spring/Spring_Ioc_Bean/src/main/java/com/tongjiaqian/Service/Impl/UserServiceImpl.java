package com.tongjiaqian.Service.Impl;

import com.tongjiaqian.Dao.BookDao;
import com.tongjiaqian.Dao.Impl.BookDaoImpl;
import com.tongjiaqian.Service.UserService;

public class UserServiceImpl implements UserService {
    public BookDao bookDao = new BookDaoImpl();
    @Override
    public void save() {
        System.out.println("UserService...");
        bookDao.save();
    }
}

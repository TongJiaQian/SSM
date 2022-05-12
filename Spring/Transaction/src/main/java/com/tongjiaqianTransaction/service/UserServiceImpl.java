package com.tongjiaqianTransaction.service;

import com.tongjiaqianTransaction.dao.UserDao;
import com.tongjiaqianTransaction.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserLog userLog;
    @Override
    public void exchangeAge(int id1, int id2, int age) {
        try {
            userDao.addAge(id1,age);
            userDao.decreaseAge(id2,age);
        }finally {
            String msg = "id="+id1+"的年龄增加了"+age+".id="+id2+"的年龄减少了"+age;
            userLog.log(id1,id2,age,msg);
        }

    }
}

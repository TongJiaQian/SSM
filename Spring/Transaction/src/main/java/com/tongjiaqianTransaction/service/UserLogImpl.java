package com.tongjiaqianTransaction.service;

import com.tongjiaqianTransaction.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogImpl implements UserLog{
    @Autowired
    private LogDao logDao;
    @Override
    public void log(int id1, int id2, int age,String msg) {
        logDao.log(id1,id2,age,msg);
    }
}

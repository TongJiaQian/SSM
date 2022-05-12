package com.tongjiaqian.service.impl;

import com.tongjiaqian.dao.aopDao;
import com.tongjiaqian.service.aopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class aopServiceImpl implements aopService {
    @Autowired
    private aopDao dao;
    @Override
    public void save() {
        System.out.println("save...");
        dao.save();
    }

    @Override
    public void delete() {
        System.out.println("delete...");
        dao.save();
    }
}

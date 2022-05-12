package com.tongjiaqian.dao.impl;

import com.tongjiaqian.dao.aopDao;
import org.springframework.stereotype.Repository;

@Repository
public class aopDaoImpl implements aopDao {
    @Override
    public void save() {
        System.out.println("aopDao...");
    }
}

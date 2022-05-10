package com.tongjiaqian.Dao.Impl;

import com.tongjiaqian.Dao.BookDao;

public class BookDaoImpl implements BookDao {
    //简单类型注入
    int number;
    String string;

    //简单类型setter方法
    public void setNumber(int number) {
        this.number = number;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public void save() {
        System.out.println("BookDao..."+","+string+","+number);
    }
}

package com.tongjiaqian.Dao.Impl;

import com.tongjiaqian.Dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Value("${bookName}")
    private String bookname;
    @Override
    public void save() {
        System.out.println("BookDao..."+bookname);
    }
}

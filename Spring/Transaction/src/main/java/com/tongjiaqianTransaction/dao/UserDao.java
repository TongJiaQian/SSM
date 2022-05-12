package com.tongjiaqianTransaction.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Update("update user set age=age+${age} where id=${id}")
    void addAge(@Param("id") int id,@Param("age") int age);

    @Update("update user set age=age-${age} where id=${id}")
    void decreaseAge(@Param("id") int id,@Param("age") int age);
}

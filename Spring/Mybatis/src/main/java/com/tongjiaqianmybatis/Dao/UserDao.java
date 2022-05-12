package com.tongjiaqianmybatis.Dao;

import com.tongjiaqianmybatis.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from user;")
    List<User> selectAll();

    @Select("select * from user where id = ${id};")
    User selectById(Integer id);
}

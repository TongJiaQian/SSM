package com.tongjiaqianTransaction.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {
    @Insert("insert into log values ('${msg}',now())")
    void log(@Param("id1") int id1,@Param("id2") int id2,@Param("age") int age,@Param("msg") String msg);
}

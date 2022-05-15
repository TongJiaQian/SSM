package com.tongjiaqian.dao;

import com.tongjiaqian.pojo.PhoneBrand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneBrandDao {
    //查询所有
    @Select("select * from phonebrand")
    List<PhoneBrand> selectAll();

    //通过id查询1
    @Select("select * from phonebrand where id = ${id}")
    PhoneBrand selectById(Integer id);

    //通过id删除
    @Delete("delete from phonebrand where id = ${id}")
    int deleteById(Integer id);

    //增加手机品牌
    @Insert("insert into phonebrand values (null, '${brand}', '${model}', '${soc}', ${price})")
    int insert(PhoneBrand phoneBrand);

    //修改手机品牌
    @Update("update phonebrand set brand = '${brand}', model = '${model}', soc = '${soc}', price = '${price}' where id = ${id}")
    int update(PhoneBrand phoneBrand);

}

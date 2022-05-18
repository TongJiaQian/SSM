package com.tongjiaqian.service;

import com.tongjiaqian.pojo.PhoneBrand;

import java.util.List;

public interface PhoneBrandService {
    //查询所有
    List<PhoneBrand> selectAll();

    //通过id查询1
    PhoneBrand selectById(Integer id);

    //通过id删除
    boolean deleteById(Integer id);

    boolean deleteByGroupId(Integer[] ids);

    //增加手机品牌
    boolean insert(PhoneBrand phoneBrand);

    //修改手机品牌
    boolean update(PhoneBrand phoneBrand);
}

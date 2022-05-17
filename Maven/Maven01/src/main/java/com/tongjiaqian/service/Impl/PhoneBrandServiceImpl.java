package com.tongjiaqian.service.Impl;

import com.tongjiaqian.dao.PhoneBrandDao;
import com.tongjiaqian.pojo.PhoneBrand;
import com.tongjiaqian.service.PhoneBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneBrandServiceImpl implements PhoneBrandService {
    @Autowired
    private PhoneBrandDao dao;
    @Override
    public List<PhoneBrand> selectAll() {
        return dao.selectAll();
    }

    @Override
    public PhoneBrand selectById(Integer id) {
        return dao.selectById(id);
    }

    //删除后查询所有的品牌
    @Override
    public boolean deleteById(Integer id) {
        return dao.deleteById(id) > 0;
    }

    @Override
    public boolean deleteByGroupId(Integer[] ids) {
        int count = 0;//计数，影响的有多少行
        for (int i=0;i<ids.length;i++){
            count+=dao.deleteById(ids[i]);
        }
        return count>0;
    }

    @Override
    public boolean insert(PhoneBrand phoneBrand) {
        return dao.insert(phoneBrand) > 0;
    }

    @Override
    public boolean update(PhoneBrand phoneBrand) {
        return dao.update(phoneBrand) > 0;
    }
}

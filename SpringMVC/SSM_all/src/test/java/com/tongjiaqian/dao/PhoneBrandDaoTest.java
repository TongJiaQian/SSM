package com.tongjiaqian.dao;

import com.tongjiaqian.config.SpringConfig;
import com.tongjiaqian.pojo.PhoneBrand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class PhoneBrandDaoTest {
    @Autowired
    private PhoneBrandDao phoneBrandDao;
    @Test
    public void selectByIdTest(){
        PhoneBrand phoneBrand = phoneBrandDao.selectById(1);
        System.out.println(phoneBrand);
    }
    @Test
    public void selectAll(){
        List<PhoneBrand> phoneBrands = phoneBrandDao.selectAll();
        System.out.println(phoneBrands);
    }
    @Test
    public void insertBrand(){
        PhoneBrand phoneBrand = new PhoneBrand();
        phoneBrand.setBrand("1s");
        phoneBrand.setModel("1");
        phoneBrand.setSoc("1");
        phoneBrand.setPrice(123);
        int flag = phoneBrandDao.insert(phoneBrand);
        System.out.println(flag);
    }
}

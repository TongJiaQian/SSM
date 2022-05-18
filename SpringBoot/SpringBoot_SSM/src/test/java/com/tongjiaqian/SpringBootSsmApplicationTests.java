package com.tongjiaqian;

import com.tongjiaqian.pojo.PhoneBrand;
import com.tongjiaqian.service.PhoneBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootSsmApplicationTests {
    @Autowired
    private PhoneBrandService service;

    @Test
    public void daoTest(){
        PhoneBrand brand = service.selectById(2);

        System.out.println(brand);
    }
}

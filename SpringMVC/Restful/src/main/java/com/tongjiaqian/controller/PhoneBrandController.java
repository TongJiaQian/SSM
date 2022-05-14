package com.tongjiaqian.controller;

import com.tongjiaqian.pojo.PhoneBrand;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/PhoneBrands")
public class PhoneBrandController {
    @GetMapping
    public List<PhoneBrand> getAll(){
        List<PhoneBrand> brandList = new ArrayList<PhoneBrand>();
        PhoneBrand brand1 = new PhoneBrand();
        brand1.setId(1);
        brand1.setBrand("iQOO");
        brand1.setModel("iQOO neo3");
        brand1.setSoc("骁龙865");
        brand1.setPrice(3299);
        brandList.add(brand1);

        PhoneBrand brand2 = new PhoneBrand();
        brand2.setId(2);
        brand2.setBrand("huawei");
        brand2.setModel("mate40");
        brand2.setSoc("麒麟9000");
        brand2.setPrice(6999);
        brandList.add(brand2);

        return brandList;
    }
}

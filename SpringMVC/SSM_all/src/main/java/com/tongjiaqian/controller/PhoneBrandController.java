package com.tongjiaqian.controller;

import com.tongjiaqian.pojo.PhoneBrand;
import com.tongjiaqian.service.PhoneBrandService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PhoneBrands")
public class PhoneBrandController {
    @Autowired
    private PhoneBrandService service;
    @GetMapping
    public Result selectAll(){
        System.out.println("selectAll");
        List<PhoneBrand> brandList = service.selectAll();
        return new Result(Code.SELECT_OK,brandList);
    }
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        System.out.println("selectById");
        PhoneBrand brand = service.selectById(id);
        return new Result(Code.SELECT_OK,brand);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        System.out.println("deleteById");
        boolean flag = service.deleteById(id);
        if(flag){
            return new Result(Code.DELETE_OK,null);
        }
        else{
            return new Result(Code.DELETE_ERR,null,"删除失败！");
        }
    }
    @RequestMapping("/deleteByIds")
    public Result deleteByGroupId(@RequestBody Integer[] ids){
        System.out.println("deleteByGroupId");
        boolean flag = service.deleteByGroupId(ids);
        if(flag){
            return new Result(Code.DELETE_OK,null);
        }
        else{
            return new Result(Code.DELETE_ERR,null,"删除失败！");
        }
    }
    @PostMapping
    public Result insertBrand(@RequestBody PhoneBrand phoneBrand){
        System.out.println("insertBrand");
        System.out.println(phoneBrand);
        boolean flag = service.insert(phoneBrand);
        System.out.println(flag);
        if(flag){
            return new Result(Code.INSERT_OK,null);
        }
        else{
            return new Result(Code.INSERT_ERR,null,"新增失败");
        }
    }

    @PutMapping
    public Result updateBrand(@RequestBody PhoneBrand phoneBrand){
        System.out.println("updateBrand");
        boolean flag = service.update(phoneBrand);
        if(flag){
            return new Result(Code.UPDATE_OK,null);
        }
        else{
            return new Result(Code.UPDATE_ERR,null,"修改失败");
        }
    }
}

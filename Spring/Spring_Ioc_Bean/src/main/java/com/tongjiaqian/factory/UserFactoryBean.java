package com.tongjiaqian.factory;

import com.tongjiaqian.Service.Impl.UserServiceImpl;
import com.tongjiaqian.Service.UserService;
import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<UserService> {
    //获取Bean对象的方法
    @Override
    public UserService getObject() throws Exception {
        return new UserServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }
}

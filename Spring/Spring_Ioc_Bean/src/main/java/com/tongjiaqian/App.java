package com.tongjiaqian;

import com.tongjiaqian.Service.Impl.UserServiceImpl;
import com.tongjiaqian.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* 传统方式
        *UserService userservice = new UserServiceImpl();
        *userservice.save();
        */

        //利用IOC,获取ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userservice");
        userService.save();
    }
}

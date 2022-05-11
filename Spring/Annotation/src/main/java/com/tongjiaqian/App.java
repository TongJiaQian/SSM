package com.tongjiaqian;

import com.tongjiaqian.Service.Impl.UserServiceImpl;
import com.tongjiaqian.Service.UserService;
import com.tongjiaqian.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //纯注解开发
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = ctx.getBean("userService",UserService.class);
        userService.save();
    }
}

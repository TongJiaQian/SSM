package com.tongjiaqianmybatis;

import com.tongjiaqianmybatis.Service.UserService;
import com.tongjiaqianmybatis.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class AppForMybatis
{
    public static void main( String[] args ) throws Exception {
        //测试数据库
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService bean1 = ctx.getBean(UserService.class);
        bean1.showAllUser();
        bean1.showUserById(1);
    }
}

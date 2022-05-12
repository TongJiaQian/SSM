package com.tongjiaqianTransaction;

import com.tongjiaqianTransaction.config.AppConfig;
import com.tongjiaqianTransaction.service.UserService;
import com.tongjiaqianTransaction.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = ctx.getBean(UserService.class);
        service.exchangeAge(1,2,3);
    }
}

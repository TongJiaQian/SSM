package com.tongjiaqian;

import com.tongjiaqian.config.AppConfig;
import com.tongjiaqian.service.aopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        aopService service = ctx.getBean(aopService.class);
        service.save();
        System.out.println("----------");
        service.delete();
    }
}

package com.tongjiaqianmybatis.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.tongjiaqianmybatis")
@PropertySource("classpath:practice.properties")
@Import({jdbcConfig.class, mybatisConfig.class})
public class AppConfig {
}

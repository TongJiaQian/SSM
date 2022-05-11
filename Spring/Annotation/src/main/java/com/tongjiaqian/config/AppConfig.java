package com.tongjiaqian.config;

import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.tongjiaqian")
@PropertySource("classpath:practice.properties")
@Import(jdbcConfig.class)
public class AppConfig {
}

package com.tongjiaqian.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.tongjiaqian.service","com.tongjiaqian.dao"})
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}

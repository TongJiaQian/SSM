package com.tongjiaqian.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.tongjiaqian")
@PropertySource("classpath:practice.properties")
public class AppConfig {
}

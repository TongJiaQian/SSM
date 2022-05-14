package com.tongjiaqian.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.tongjiaqian.controller")
@EnableWebMvc
public class SpringMvcConfig {
}

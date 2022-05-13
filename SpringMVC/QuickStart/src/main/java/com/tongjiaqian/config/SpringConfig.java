package com.tongjiaqian.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.tongjiaqian.dao","com.tongjiaqian.service"})
public class SpringConfig {
}

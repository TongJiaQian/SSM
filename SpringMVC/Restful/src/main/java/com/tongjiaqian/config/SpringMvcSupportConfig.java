package com.tongjiaqian.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupportConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/PhoneBrands/**").addResourceLocations("/PhoneBrands/");
        registry.addResourceHandler("/element-ui/**").addResourceLocations("/element-ui/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
    }
}

package com.ceryni.guild.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * User: Ceryni
 * Date: 8/31/13
 * Time: 4:24 AM
 */
@Configuration
@ComponentScan(basePackages = "com.ceryni.guild.*")
public class WebConfig extends WebMvcConfigurationSupport{

    @Bean
    public ViewResolver internalViewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/pages/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}

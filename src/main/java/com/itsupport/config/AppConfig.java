package com.itsupport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String appBean() {
        return "This is an app-specific bean";
    }
}

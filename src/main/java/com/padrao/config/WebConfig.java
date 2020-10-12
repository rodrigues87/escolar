package com.padrao.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("forward:/dashboard");
    }
}

package com.subway.config;

import com.subway.interceptor.FirstLoginInterceptor;
import com.subway.interceptor.SecondLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Date;

@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FirstLoginInterceptor()).addPathPatterns("/inspection/**");
        registry.addInterceptor(new SecondLoginInterceptor()).addPathPatterns("/inspection/**");
    }



}

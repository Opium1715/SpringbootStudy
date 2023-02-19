package com.springboot.zq.config;

import com.springboot.zq.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration(proxyBeanMethods = true)
public class InterceptorsConfig implements WebMvcConfigurer {
    private static final String[] PassPath = new String[]{"/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**"};
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //静态资源被误拦截
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns(PassPath);
    }
}

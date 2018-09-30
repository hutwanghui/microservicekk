package org.hut.kkuser.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by hutwanghui on 2018/9/21.
 * email:zjjhwanhui@163.com
 * qq:472860892
 * 在SpringBoot2.0及Spring 5.0 WebMvcConfigurerAdapter已被废弃
 * 直接直接实现WebMvcConfigurer
 * 或者继承WebMvcConfigurationSupport
 */
@Configuration
public class InteceptorConfig implements WebMvcConfigurer {
    @Autowired
    private IDinterceptor iDinterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(iDinterceptor);
    }
}

package com.cmdbms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description: 拦截器注册
 * Author: Edarward
 */
@Configuration
public class MyWebAppConfig implements WebMvcConfigurer {

    /*@Bean
    MyInterceptor localInterceptor(){
        return new MyInterceptor();
    }*/

    @Autowired
    private MyInterceptor myInterceptorl;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //后台拦截器
        registry.addInterceptor(myInterceptorl)
                //添加拦截规则
                .addPathPatterns("/**")
                //排除拦截规则
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");//swagger页面放行
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    /**
     * Description: 如果出现以下错误：  No mapping for GET /api/swagger-ui.html  使用
     * Author: Edarward
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        //静态路径配置
        registry.addResourceHandler("/image/**").addResourceLocations("file:D://OTA/");
    }

}

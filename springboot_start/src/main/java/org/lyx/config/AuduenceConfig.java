package org.lyx.config;

import org.lyx.service.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value = "org.lyx")
/*
* EnableAspectJAutoProxy 开启自动代理功能，通过JavaConfig进行配置，使用@EnableAspectJAutoProxy标签开启
* aop开启的标志
*
* Configuration些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，并用于构建bean定义，初始化Spring容器。
* @Configuration启动容器+@Bean注册Bean
* */
public class AuduenceConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
}

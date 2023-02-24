package org.lyx.config;

import org.lyx.service.JumpIndroducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(value = "org.lyx.service")
public class JumpConfig {
    @Bean
    public JumpIndroducer jumpIndroducer(){
        return new JumpIndroducer();
    }
}

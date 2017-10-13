package com.github.prontera.config;

import com.github.prontera.controller.TccErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈德元
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public TccErrorDecoder tccErrorDecoder() {
        return new TccErrorDecoder();
    }
}

package com.github.prontera.config;

import com.github.prontera.aspect.HibernateValidatorAspect;
import com.github.prontera.controller.StatusCode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈德元
 */
@Configuration
public class AopConfiguration {

    @Bean
    public HibernateValidatorAspect hibernateValidatorAspect() {
        final int order = Byte.MAX_VALUE + 2;
        return new HibernateValidatorAspect(order, StatusCode.INVALID_MODEL_FIELDS);
    }

}

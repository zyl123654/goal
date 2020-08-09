package com.jmd.goal.enums;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Cao Fuqiang
 */
@Configuration
@Slf4j
public class EnumMybatisStarterConfiguration {
    @Bean
    ConfigurationCustomizer mybatisConfigurationCustomizer() {
        log.warn("Mybatis set DefaultEnumTypeHandler -> BaseEnumTypeHandler!");
        return configuration -> configuration.getTypeHandlerRegistry().setDefaultEnumTypeHandler(EnumTypeHandler.class);
    }
}

package cn.cnowse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.Retryer;

@Configuration
public class FeignConfig {

    @Bean
    public Retryer myRetryer() {
        return new Retryer.Default(100, 1, 3);
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
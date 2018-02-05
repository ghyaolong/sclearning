package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

@Configuration
public class Configuration1 {
	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
}

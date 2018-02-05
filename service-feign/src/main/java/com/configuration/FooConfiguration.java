package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class FooConfiguration {
	/*@Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }*/

	/**
	 * 如果注册中心配置了启用了安全配置，这里就是指定用户名和密码的地方
	 * @return
	 */
   /* @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("zhangsan", "111111");
    }*/
}

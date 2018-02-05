package com.yao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

//@Configuration
//@ExcludeFromComponentScan
public class TestConfiguration {

	
	@Bean
	@ConditionalOnMissingBean
	public IRule ribbonRule(IClientConfig config) {
		return new RandomRule();
	}
}

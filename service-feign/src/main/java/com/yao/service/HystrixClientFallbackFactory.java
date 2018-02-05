package com.yao.service;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<SchedualServiceHi> {

	@Override
	public SchedualServiceHi create(Throwable cause) {
		
		return new HystrixClientWithFallBackFactory() {
			@Override
			public String sayHiFromClientOne(String name) {
				// TODO Auto-generated method stub
				return "fallback;reason was:"+cause.getMessage();
			}
		};
	}
}

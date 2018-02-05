package com.yao.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.configuration.Configuration1;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class/*,fallbackFactory=HystrixClientFallbackFactory.class*/
		,configuration=Configuration1.class)
public interface SchedualServiceHi {
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET,consumes="")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

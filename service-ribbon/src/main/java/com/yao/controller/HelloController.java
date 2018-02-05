package com.yao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yao.service.HelloService;

/**
 * Created by yaochenglong on 17/12/13.
 */
@RestController
public class HelloController {
    
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hello")
    public String hello(String name){
		ServiceInstance instance = loadBalancerClient.choose("service-hi");
		System.out.println(instance.getHost()+":"+instance.getPort()+":"+instance.getServiceId());
    		//return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
       // return restTemplate.getForObject("http://HELLO-SERVICE/hello",String.class);
		return null;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
    HelloService helloService;
	
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}

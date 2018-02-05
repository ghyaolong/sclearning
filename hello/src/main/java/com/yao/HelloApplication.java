package com.yao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloApplication {

	//private static Logger logger = Logger.getLogger(HelloApplication.class);
//
//	@Autowired
//	private DiscoveryClient discoveryClient;

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	
	@Value("${server.port}")
    String port;

//	@Bean
//	@LoadBalanced
//	RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

//	@Autowired
//	RestTemplate restTemplate;

//	@RequestMapping(value = "/hello", method = RequestMethod.GET)
//	public String index(String name) {
//		ServiceInstance instance = discoveryClient.getLocalServiceInstance();
//		logger.info("/hello,host:" + instance.getHost() + ",service Id:" + instance.getServiceId() + "====" + name);
//		//return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
//		return "hello world:" + name;
//	}
	
	@RequestMapping(value="/hi",method=RequestMethod.GET)
    public String home(@RequestParam String name) throws InterruptedException {
		Thread.sleep(3000);
        return "hi "+name+",i am from port:" +port;
    }
}

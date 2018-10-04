package com.yangguang.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	//切换ribbon负载均衡的算法
	@Bean
	public IRule myRule() {
		return new RoundRobinRule();//默认轮询
//		return new RandomRule();//随机
//		return new RetryRule();
	}
}

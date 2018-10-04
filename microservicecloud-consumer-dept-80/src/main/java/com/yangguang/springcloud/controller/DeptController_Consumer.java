package com.yangguang.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yangguang.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {

	@Autowired
	private RestTemplate restTemplate;

	//private static final String RESTURI_PREFIX = "http://localhost:8001";
	private static final String RESTURI_PREFIX = "http://MICROSERVICECLOUD-DEPT";

	@PostMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(RESTURI_PREFIX + "/dept/add", dept, Boolean.class);
	}

	@GetMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable long id) {
		return restTemplate.getForObject(RESTURI_PREFIX + "/dept/get/" + id, Dept.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(RESTURI_PREFIX + "/dept/list", List.class);
	}

	// 测试@EnableDiscoveryClient,消费端可以调用服务发现
	@RequestMapping(value = "/consumer/dept/discovery")
	public Object discovery() {
		return restTemplate.getForObject(RESTURI_PREFIX + "/dept/discovery", Object.class);
	}
}

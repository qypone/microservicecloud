package com.yangguang.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yangguang.springcloud.entities.Dept;
import com.yangguang.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService service;
	
	@PostMapping(value = "/consumer2/dept/add")
	public boolean add(Dept dept) {
		return this.service.add(dept);
	}
	
	@GetMapping(value = "/consumer2/dept/get/{id}")
	public Dept get(@PathVariable long id) {
		return this.service.get(id);
	}

	@GetMapping(value = "/consumer2/dept/list")
	public List<Dept> list() {
		return this.service.list();
	}
}

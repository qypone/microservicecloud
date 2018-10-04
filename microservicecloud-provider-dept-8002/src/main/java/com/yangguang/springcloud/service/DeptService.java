package com.yangguang.springcloud.service;

import java.util.List;

import com.yangguang.springcloud.entities.Dept;

public interface DeptService {

	public Dept get(Long id);

	public boolean add(Dept dept);

	public List<Dept> list();
}

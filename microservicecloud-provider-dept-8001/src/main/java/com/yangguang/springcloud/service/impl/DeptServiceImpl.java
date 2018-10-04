package com.yangguang.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangguang.springcloud.dao.DeptDao;
import com.yangguang.springcloud.entities.Dept;
import com.yangguang.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptdao;
	
	@Override
	public Dept get(Long id) {
		return deptdao.findById(id);
	}

	@Override
	public boolean add(Dept dept) {
		return deptdao.addDept(dept);
	}

	@Override
	public List<Dept> list() {
		return deptdao.findAll();
	}

}

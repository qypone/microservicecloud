package com.yangguang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptComsumer_Dashboard_App {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptComsumer_Dashboard_App.class, args);
	}

}

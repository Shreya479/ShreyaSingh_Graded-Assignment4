package com.employee;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import com.employee.SpringBootEmployeeDesignApplication;
@ComponentScan
(basePackages={"com.employee.controller","com.employee.service"})
//@EnableJpaRepositories
@SpringBootTest
class SpringBootEmployeeDesignApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeDesignApplication.class,args);
		System.out.println("Hello, Welcome to my REST API Application.....");
	}

}

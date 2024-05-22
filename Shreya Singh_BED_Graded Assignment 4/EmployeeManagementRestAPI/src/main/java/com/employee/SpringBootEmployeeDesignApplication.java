package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
@ComponentScan
(basePackages={"com.employee.controller","com.employee.service", "com.employee.repository","com.employee.util", "com.employee.config","com.employee.model"})

@SpringBootApplication
@EnableWebSecurity
public class SpringBootEmployeeDesignApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeDesignApplication.class, args);
		System.out.println("Hello, Welcome to my REST API Application.....");
	}
}

package com.project.StudentManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan({"com.project.StudentManagementSystem","com.project.StudentManagementSystem.controller","project.StudentManagementSystem.model","project.StudentManagementSystem.repository","project.StudentManagementSystem.service","project.StudentManagementSystem.exception"}) 
public class ApplicationStudentManagementSystem {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStudentManagementSystem.class, args);
	}

}

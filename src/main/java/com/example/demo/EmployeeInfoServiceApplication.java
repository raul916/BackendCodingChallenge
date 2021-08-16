package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.repos.EmployeeRepository;

@SpringBootApplication
public class EmployeeInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeInfoServiceApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			EmployeeRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				  repo.save(new Employee("a0@gmail.com", "a0","Corporate bank", "Associate", "Nobody cares", 1500));
			}
		};
	}*/
}

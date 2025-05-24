package com.example.EmployeeManagerCLI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class EmployeeManagerCliApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerCliApplication.class, args);
	}

}

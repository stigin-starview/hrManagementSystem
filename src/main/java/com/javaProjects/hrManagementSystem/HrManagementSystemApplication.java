package com.javaProjects.hrManagementSystem;

import com.javaProjects.hrManagementSystem.department.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//Helps to serve rest class endpoints
@RestController
public class HrManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrManagementSystemApplication.class, args);
	}
	//rest endpoint
	@GetMapping
	public List<Department> hello() {
		return List.of(
				new Department(
						22L,
						"hr",
						15L,
						"something",
						LocalDate.of(2000, Month.JANUARY,5),
						2220000f,
						10,
						"DF6"

				)
		);
	}
}

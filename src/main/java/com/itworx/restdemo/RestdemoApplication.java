package com.itworx.restdemo;

import com.itworx.restdemo.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);

		Employee employee = new Employee();
		employee.setId(1345l);
		employee.setFirstName("John");
		employee.setLastName("Refaat");
		employee.setEmailId("john.refaat@itworx.com");
		System.out.println(employee.toString());
	}

}

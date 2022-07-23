package com.projectExpense.project;
import com.employee.respository.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.respository.Employee;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		
		
		 Employee emp1 =new  Employee(4, "Ashley", "James", 1004);
		 
			
				
				
	}

	

}

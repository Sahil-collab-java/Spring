package com._09_Spring_TimeStamp_Custom_Generator;

import com._09_Spring_TimeStamp_Custom_Generator.Model.Employee;
import com._09_Spring_TimeStamp_Custom_Generator.Repo.EmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext =  SpringApplication.run(Application.class, args);

	EmployeeRepo repo = 	applicationContext.getBean(EmployeeRepo.class);

		Employee employee = new Employee();

		//employee.setEmpId(1);
		employee.setEmpName("Sahil");
		employee.setEmpSalary(2000.0);
		employee.setEmpGender("Male");
		employee.setDept("IT");

		repo.save(employee);

		System.out.println("Data Saved.................");



	}

}

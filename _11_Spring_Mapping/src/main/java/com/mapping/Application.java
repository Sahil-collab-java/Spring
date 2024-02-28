package com.mapping;

import com.mapping.Model.Adress;
import com.mapping.Model.Employee;
import com.mapping.Repos.EmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

	ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

	EmployeeRepo repo =  applicationContext.getBean(EmployeeRepo.class);


		/*Employee employee = new Employee();

		employee.setEmpName("Sahil");
		employee.setEmpSalary(30000000000000000.00);

		Adress adress = new Adress();

		adress.setState("Maharashtra");
		adress.setCity("Nagpur");
		adress.setCountry("India");
		adress.setEmp(employee);

		Adress adress2 = new Adress();

		adress2.setState("MP");
		adress2.setCity("Chinchwad");
		adress2.setCountry("India");
		adress2.setEmp(employee);



		employee.setAdressList(Arrays.asList(adress,adress2));

		repo.save(employee);

		System.out.println("Data inserted ..................................."); */

		Optional<Employee> employee = repo.findById(1);

		System.out.println(employee.get());


	}

}

package com._09_Spring_TimeStamp_Custom_Generator.Repo;

import com._09_Spring_TimeStamp_Custom_Generator.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface EmployeeRepo extends JpaRepository<Employee, Serializable> {
}

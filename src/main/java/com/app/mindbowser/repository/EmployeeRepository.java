package com.app.mindbowser.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.mindbowser.model.Employee;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
	
}

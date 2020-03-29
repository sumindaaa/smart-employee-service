package com.sumindaa.demo.employeeservice.model;

import com.sumindaa.demo.employeeservice.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Employee, Integer> {
}

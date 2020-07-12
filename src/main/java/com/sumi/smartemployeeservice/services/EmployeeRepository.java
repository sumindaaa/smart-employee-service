package com.sumi.smartemployeeservice.services;

import com.sumi.smartemployeeservice.modal.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}

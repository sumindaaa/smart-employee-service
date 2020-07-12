package com.sumi.smartemployeeservice.services;

import com.sumi.smartemployeeservice.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }


    public Optional<Employee> getEmployee(Integer id) {
        return employeeRepository.findById(id);

    }

    public void createEmployee(Employee employee) {

        employeeRepository.save(employee);
    }


    public void editEmployee(Employee employee, int id) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);

    }
}
package com.sumindaa.demo.employeeservice.service;

import com.sumindaa.demo.employeeservice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = Arrays.asList(
            new Employee("suminda", "amara", "male"),
            new Employee("chaminda", "amara", "male"),
            new Employee("sethu", "amara", "female")


    );


    public void updateEmployee(int id, Employee employee) {
    }

    public void deleteEmployee(int id) {
    }

    public void updateEmployee(Employee employee) {
    }

    // public Employee getEmployee(int id) {
    //  }

    public void addEmployee(Employee employee) {
    }

    public List<Employee> getAllEmployees() {
        return employees;

    }

    public Employee getEmployee(String id) {
        return employees.stream().filter(t -> t.getFirstName().equals(id)).findFirst().get();
    }
}

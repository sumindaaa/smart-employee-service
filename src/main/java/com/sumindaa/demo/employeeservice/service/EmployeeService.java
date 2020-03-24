package com.sumindaa.demo.employeeservice.service;

import com.sumindaa.demo.employeeservice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList(Arrays.asList(
            new Employee("suminda", "amara", "male"),
            new Employee("chaminda", "amara", "male"),
            new Employee("sethu", "amara", "female")


    ));


    public void updateEmployee(String id, Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee t = employees.get(i);
            if (t.getFirstName().equals(id)) {
             employees.set(i, employee);
             return;

            }
        }
    }

    public void deleteEmployee(int id) {
    }

    public void updateEmployee(Employee employee) {
    }

    // public Employee getEmployee(int id) {
    //  }

    public void addEmployee(Employee employee) {
        // Employee emp = new Employee();
        // emp.setFirstName(employee.getFirstName());
        //emp.setGender(employee.getGender());
        //emp.setLastName(employee.getLastName());
        System.out.println(employee.getGender());
        employees.add(employee);

    }

    public List<Employee> getAllEmployees() {
        return employees;

    }

    public Employee getEmployee(String id) {
        return employees.stream().filter(t -> t.getFirstName().equals(id)).findFirst().get();
    }
}

package com.sumi.smartemployeeservice.services;

import com.sumi.smartemployeeservice.modal.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee(1, "sumi", "katu"),

            new Employee(2, "sumi", "katu")

    ));


    public List<Employee> getEmployees() {

        return employees;
    }

    public Employee getEmployee(int id) {
        Employee emp = new Employee();
        for (Employee employee : employees
        ) {
            if (employee.getId() == id) {
                emp = employee;
            }
        }
        return emp;
    }

    public void createEmployee(Employee employee) {
        employees.add(employee);
    }

    public void editEmployee(Employee employee, int id) {
        Employee temp = new Employee();
        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getId() == id) {
                employees.set(i, employee);
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getId() == id) {
                employees.remove(i);
            }
        }

    }
}
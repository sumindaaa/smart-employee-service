package com.sumindaa.demo.employeeservice.service;

import com.sumindaa.demo.employeeservice.model.EmpRepository;
import com.sumindaa.demo.employeeservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    static int max = 1;
    @Autowired
    EmpRepository empRepository;
    private List<Employee> employees = new ArrayList(Arrays.asList(
            new Employee(1, "suminda",
                    "amarasinghe",
                    "male")


    ));


    public void updateEmployee(int id, Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee t = employees.get(i);
            if (t.getId() == id) {
                employee.setId(id);
                employees.set(i, employee);
                return;

            }
        }
    }

    public void deleteEmployee(int id) {

        employees.remove(getEmployee(id));
    }

    public void addEmployee(Employee employee) {
        employee.setId(generateID());
        employees.add(employee);

    }

    public List<Employee> getAllEmployees() {
        empRepository.findAll().forEach(employees::add);
        return employees;
    }


    public Employee getEmployee(int id) {
        Employee tem1 = new Employee();
        for (Employee emp : employees
        ) {
            int tem2 = emp.getId();
            if (id == tem2) {
                tem1 = emp;
            }
        }
        return tem1;
    }

    public int generateID() {


        for (Employee emp : employees
        ) {
            if (max <= emp.getId())
                max = emp.getId();

        }
        max = max + 1;
        return max;
    }


}

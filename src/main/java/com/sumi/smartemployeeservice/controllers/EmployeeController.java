package com.sumi.smartemployeeservice.controllers;

import com.sumi.smartemployeeservice.modal.Employee;
import com.sumi.smartemployeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getEmployees();

    }

    @RequestMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    public void editEmployee(@RequestBody Employee employee, @PathVariable int id) {
        employeeService.editEmployee(employee, id);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }


}

package com.sumindaa.demo.employeeservice.controller;

import com.sumindaa.demo.employeeservice.model.Employee;
import com.sumindaa.demo.employeeservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
class EmployeeController {
    @RequestMapping("/employees")
    public String getAllTopics() {
        return "all topics";

    }

    @RequestMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return EmployeeService.getEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void addEmployee(@RequestBody Employee employee) {
        EmployeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    public void addEmployee(@RequestBody Employee employee, @PathVariable int id) {
        EmployeeService.updateEmployee(id, employee);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        EmployeeService.deleteEmployee(id);
    }
}

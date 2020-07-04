package com.sumi.smartemployeeservice.controllers;

import com.sumi.smartemployeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private EmployeeService employeeService;
@RequestMapping("/hello")
    public String sayHi(){
    return "hi";
}


}


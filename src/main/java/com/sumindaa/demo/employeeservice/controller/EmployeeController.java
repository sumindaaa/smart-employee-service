package com.sumindaa.demo.employeeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {
    @RequestMapping("/employees")
    public String getAllTopics(){
        return "all topics";

    }
}

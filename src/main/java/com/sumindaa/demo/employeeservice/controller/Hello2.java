package com.sumindaa.demo.employeeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Hello2 {
    @RequestMapping("/hello2")
    public String sayHi(){
        return "hiii";
    }

}

package com.sumindaa.demo.employeeservice;

import com.sumindaa.demo.employeeservice.model.Employee;
import com.sumindaa.demo.employeeservice.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class EmployeeServiceApplicationTests {
    EmployeeService employeeService = new EmployeeService();

	@Test
	void addEmployee1() {
		EmployeeService employeeService = new EmployeeService();
		assertEquals( employeeService.getEmployee(2).getId(),2);

	}

	@Test
	void addEmployee2() {
		EmployeeService employeeService = new EmployeeService();

		Employee employee = new Employee(5,"gayan", "Wijesooriya", "male");
		employeeService.addEmployee(employee);
		System.out.println(employeeService.getEmployee(2).getId());
		assertEquals( employeeService.getEmployee(2).getId(),2);
	}


}

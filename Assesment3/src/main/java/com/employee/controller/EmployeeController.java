package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;

import com.employee.servie.EmployeeService;

import jakarta.validation.Valid;

@RestController
//@RequestMapping("/Employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empServ;
	
	@PostMapping("/employees")
	@CrossOrigin(origins = "http://localhost:4200")
	//http://localhost:8689/employees
	public Employee registerEmployee(@Valid @RequestBody Employee emp) {
	return empServ.registerEmployee(emp);
	}
	@GetMapping("/employees")
	@CrossOrigin(origins = "http://localhost:4200")
//	http://localhost:8689/employees
	public List<Employee> GetAllEmployee() {
		return empServ.getAllEmployee();
	}
	@GetMapping("/employees/{employeeId}")
//	http://localhost:8689/employees/{employeeId}
	public Employee GetEmpbyId(@Valid @PathVariable int employeeId) {
		return empServ.getEmpbyId(employeeId);
	}
//http://localhost:8689/employees/{employeeName}
//	@GetMapping("/employees/{employeeName}")
//	public Employee getEmpbyemployeeName(@PathVariable String employeeName) {
//		return empServ.getEmpbyemployeeName(employeeName);
//	}

}

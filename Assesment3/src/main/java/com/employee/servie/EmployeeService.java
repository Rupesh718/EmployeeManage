package com.employee.servie;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Exceptions.EmployeeNotFoundexception;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;



@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public Employee registerEmployee(Employee emp) {
	return empRepo.save(emp);
	}
	
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}
	
	public Employee getEmpbyId(int employeeId) {
		return empRepo.findById(employeeId).orElseThrow(()->new EmployeeNotFoundexception("No Employee Found With Id:"+ employeeId));
	}
	
//	public Employee getEmpbyemployeeName(String employeeName) {
//		return empRepo.findbyemployeeName(employeeName);
//	}
//

	
	
}

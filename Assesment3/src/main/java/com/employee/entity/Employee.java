package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	@NotBlank(message = "Name is mandatory")
	private String employeeName;
	@NotBlank(message = "Salary is mandatory")
	private Long employeeSalary;
	@NotBlank(message = "email is mandatory")
	private String employeeEmail;
	@NotBlank(message = "Name is mandatory")
	private String employeeContactNo;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String employeeName, Long employeeSalary, String employeeEmail,
			String employeeContactNo) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.employeeContactNo = employeeContactNo;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeContactNo() {
		return employeeContactNo;
	}
	public void setEmployeeContactNo(String employeeContactNo) {
		this.employeeContactNo = employeeContactNo;
	}
	
	
	
	


}

package com.techelevator;

public class Employee {
	
	private long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	private Department department;
	private String hireDate;
	
	public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.department = department;
		this.hireDate = hireDate;
		
	}
	
	public Employee() {
		//String getFullName = firstName + lastName;
		
	}

}

package com.techelevator.hr;

import org.junit.Test;

import com.techelevator.crm.Customer;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }
    
    @Test
	public void getBalanceDue_withValidData_shouldReturnCorrectBalance() {
		Employee employee = new Employee("Howdy", "Doody");
		
		Map<String, Double> services = new HashMap<>();
		services.put("Walking" , 15.00);
		services.put("Grooming" , 25.50);
		services.put("Sitting" , 50.00);
		
		
		Double expected = (15.00 * .5) + 25.50 + 50.00;
		
		Double result = employee.getBalanceDue(services);
		
		assertEquals(expected, result);
		
		
		
	}
}

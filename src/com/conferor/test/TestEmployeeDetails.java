package com.conferor.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.conferor.EmpBusinessLogic;
import com.conferor.EmployeeDetails;

public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();

	@Test
	public void testCalculateYearlySalary() {
		employee.setName("Raj");
		employee.setAge(25);
	    employee.setMonthlySalary(8000);
	    double salary = empBusinessLogic.calculateYearlySalary(employee);
	    assertEquals(96000, salary, 0.0);
	}

	@Test
	public void testCalculateAppraisal() {
		employee.setName("Raj");
	    employee.setAge(25);
	    employee.setMonthlySalary(8000);
	    double appraisal = empBusinessLogic.calculateAppraisal(employee);
	    assertEquals(500, appraisal, 0.0);
	}
}

package com.ques2;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(){
		
	}
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages)
	{
		this.hourlyWages=hourlyWages;
		this.hoursWorked=hoursWorked;
		this.setEmployeeId(employeeId);
		this.setEmployeeName(employeeName);
	}
	
	@Override
	void calculateSalary() {
		TemporaryEmployee temporary = new TemporaryEmployee();
		double salary = hoursWorked*hourlyWages;
		temporary.setSalary(salary);
	}

}

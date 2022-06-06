package com.ques2;

public class PermanentEmployee extends Employee{

	private double basicPay;
	
	public PermanentEmployee(){
		
	}
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		this.setEmployeeId(employeeId);
		this.setEmployeeName(employeeName);
		this.basicPay=basicPay;
	}
	
	@Override
	void calculateSalary() {
		PermanentEmployee permanent = new PermanentEmployee();
		double PF_Amount = basicPay*0.12;
		double salary = basicPay - PF_Amount;
		permanent.setSalary(salary);
	}

}

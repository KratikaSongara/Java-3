package com.ques2;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
//			System.out.println(employeeObj instanceof PermanentEmployee);
			PermanentEmployee employee = new PermanentEmployee();
			double loan = employee.getSalary() - ((employee.getSalary()*15.0)/100.0);
			return loan;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			TemporaryEmployee temporary = new TemporaryEmployee();
			double loan = temporary.getSalary() - ((temporary.getSalary()*10.0)/100.0);
			return loan;
		}
		else
		{
			return 0.0;
		}
	}
	
	private Loan() {
		
	}
	
	public static Loan getLoan() {
		Loan loan = new Loan();
		return loan;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

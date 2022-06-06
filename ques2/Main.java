package com.ques2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan=Loan.getLoan();
		double a=loan.calculateLoanAmount(null);
		double permanent=loan.calculateLoanAmount(new PermanentEmployee(12,"Rahul",1200000.00));
		double temporary=loan.calculateLoanAmount(new TemporaryEmployee(20,"Saurabh",12,30));
	
		System.out.println(a);
		System.out.println(permanent);
		System.out.println(temporary);
		
	}

}

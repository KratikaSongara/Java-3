package com.ques4;
import java.util.Scanner;
import java.util.regex.*;
public class Demo {

//	public boolean validate(String username, String password, String mobileNumber, String email) {
//		if(Pattern.matches("[a-zA-Z]{3,8}", username)) {
//			
//		}
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Customer customer = new Customer();
		
		System.out.println("Enter username : ");
		String username = sc.next();
		while(Pattern.matches("[a-zA-Z]{3,8}",username)==false)
		{
			System.out.println("Enter valid username : ");
			username = sc.next();
		}
		
		System.out.println("Enter password : ");
		String password = sc.next();
		while((Pattern.matches("[a-zA-Z0-9]{3,8}", password))==false)
		{
			System.out.println("Enter valid password : ");
			password = sc.next();
		}
		
		System.out.println("Enter mobile number : ");
		String number = sc.next();
		while((Pattern.matches("[6789]{1}[0-9]{9}", number))==false)
		{
			System.out.println("Enter valid mobile number : ");
			number = sc.next();
		}
		
		System.out.println("Enter email : ");
		String email = sc.next();
		while(Pattern.matches("[a-zA-Z0-9&&[^a-zA-Z0-9]]", email)==false)
		{
			System.out.println("Enter valid email : ");
			email = sc.next();
		}
		

		Customer customer = new Customer();
		customer.setUsername(username);
		customer.setPassword(password);
		customer.setMobileNumber(number);
		customer.setEmail(email);
						
		System.out.println("Username : "+customer.getUsername());
		System.out.println("Password : "+customer.getPassword());
		System.out.println("Mobile : "+customer.getMobileNumber());
		System.out.println("Email : "+customer.getEmail());

	}

}

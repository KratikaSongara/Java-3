package com.ques1;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.println("Enter size of array : ");
			int size=sc.nextInt();
		
			int[] array = new int[size];
		
			System.out.println("Enter the elements in the array : ");
		
			for(int i=0; i<array.length; i++)
			{
				array[i]=sc.nextInt();
			}
		
			System.out.println("Enter the index of the array element you want to access");
		
			int index=sc.nextInt();
		
			System.out.println("The array element at index "+index+"="+array[index]);
			System.out.println("The array element successfully accessed");

		}
		
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException nf) {
			System.out.println("java.lang.NumberFormatException");
		}
		catch(java.util.InputMismatchException im) {
			System.out.println("java.util.InputMismatchException");
		}
	}

}

package com.index;
import java.util.Scanner;
public class ValidateAge {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
          
		System.out.println("Enter Your Age:");
		int age = obj.nextInt();
		
		if(age>=18 && age<=60) {
			System.out.println("Valid age");
			
		}else {
			System.out.println("Invalid age");
		}
	}

}

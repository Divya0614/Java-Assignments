package com.index;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a = obj.nextInt();
		
		System.out.println("Enter 2nd Number");
		int b = obj.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Result a:" + a);
		System.out.println("Result b:" + b);
		
		
		
	}

}

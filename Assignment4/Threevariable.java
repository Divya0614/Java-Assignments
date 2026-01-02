package com.index;

public class ThreeVariable {

	static int num1 = 10;
	int num2 = 20;
	
	void show() {
		int num3 = 40;
		
		System.out.println("Result"+num1);
		System.out.println("Result"+num2);
		System.out.println("result"+num3);
	}
	public static void main(String[] args) {
		ThreeVariable obj = new ThreeVariable();
		
         obj.show();
	}

}

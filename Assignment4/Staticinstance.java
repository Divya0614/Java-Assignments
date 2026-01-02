package com.index;

public class StaticInstance {
   
	static int a = 10;
	int b = 20;
	
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		 StaticInstance obj1 = new StaticInstance();
		 StaticInstance obj2 = new StaticInstance();
		 
		 obj1.a = 10;
		 obj2.b = 10;
		 
		 System.out.println("a" + obj1.a + "b" + obj1.b);
		 System.out.println("a" + obj1.a + "b" + obj1.b);
		
		 obj1.show();
		 obj2.show();
		 
		
		
	}

}

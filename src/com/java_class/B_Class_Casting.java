package com.java_class;

public class B_Class_Casting extends A_Class_Casting {

	public static void main(String[] args) {
		
		double d = 44;
		int a = (int) d;                                  // Narrowing Type Casting 
		
		B_Class_Casting b = new B_Class_Casting();        // Child Object

		A_Class_Casting c = new A_Class_Casting();        // Parent Object
		
		A_Class_Casting cb = new B_Class_Casting();       // Upcasting
		
		// 	B_Class_Casting bc = new A_Class_Casting();   // Downcasting  ---> Not possible in Java
	}
}

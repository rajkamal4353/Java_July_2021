package com.java_class;

public class Day5_24_07_2021_Compile_Time_Polymorphism {
	
	public void method_Overload() {
		System.out.println("Datatype");
	}
	
	public void method_Overload(int a) {
		System.out.println(a);
	}
	
	public void method_Overload(String name) {
		System.out.println(name);
	}
	
	public void method_Overload(int a, int b) {
		System.out.println(a+b);
	}
	
    public static void main(String[] args) {
    	
    	Day5_24_07_2021_Compile_Time_Polymorphism p = new Day5_24_07_2021_Compile_Time_Polymorphism();
    	
    	p.method_Overload();
    	
    	p.method_Overload(10);
    	
    	p.method_Overload("Data");
    	
    	p.method_Overload(10, 20);
	}
}


package com.java_class;

public class Day9_31_07_2021_Constructor1 {
	
	public Day9_31_07_2021_Constructor1() {         // non parameterized constructor
	System.out.println("Data");
	}
	
	public Day9_31_07_2021_Constructor1(int a) {    // parameterized constructor
	System.out.println(a);
	}  
	
	public Day9_31_07_2021_Constructor1(String name) {
	System.out.println(name);
    }
	
	public static void main(String[] args) {
		Day9_31_07_2021_Constructor1 c = new Day9_31_07_2021_Constructor1();
		Day9_31_07_2021_Constructor1 c1 = new Day9_31_07_2021_Constructor1(10);
		Day9_31_07_2021_Constructor1 c2 = new Day9_31_07_2021_Constructor1("Java");
	}
	
}

package com.java_class;

public class Day11_04_08_2021_Variables {
	
	static int a =20;
	
	public static void close() {              // Class Variable
	System.out.println(a);
	}
	
	public void add() {                //Local Variable
	int b = 10;
	System.out.println(b);
	}
	
	public static void sub() {                // Static Variable 
	int c = 30;
	System.out.println(c);	
	}
	
	public static void main(String[] args) { 
	Day11_04_08_2021_Variables v = new Day11_04_08_2021_Variables();
	v.add();
	close();
	sub();
	}
}

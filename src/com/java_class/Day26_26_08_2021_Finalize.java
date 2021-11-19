package com.java_class;

public class Day26_26_08_2021_Finalize {

	public Day26_26_08_2021_Finalize() {
		
		System.out.println("java");
		System.out.println("selenium");
	}
	
	public Day26_26_08_2021_Finalize(int a) {
		
		System.out.println(a);
		System.out.println("selenium");
	}
	
	public static void main(String[] args) throws Throwable {
		
		Day26_26_08_2021_Finalize f = new Day26_26_08_2021_Finalize();
		f.finalize();
		
		Day26_26_08_2021_Finalize f1 = new Day26_26_08_2021_Finalize(8);
		f1.finalize();
	}
	
}

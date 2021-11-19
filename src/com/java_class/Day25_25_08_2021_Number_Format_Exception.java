package com.java_class;

public class Day25_25_08_2021_Number_Format_Exception {
	
	public static void main(String[] args) {
		
		//Number Format Exception
		
		String s = "123abc";
		
		System.out.println(s + 456);
		
		int i = Integer.parseInt(s);
		System.out.println(i+ 789);
		
    }
}

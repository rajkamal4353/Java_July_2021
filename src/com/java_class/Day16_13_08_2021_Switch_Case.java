package com.java_class;

import java.util.Scanner;

public class Day16_13_08_2021_Switch_Case {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Number");
		int n = s.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("one");
			break;
			
		case 2:
			System.out.println("two");
			break;
			
		default:
			System.out.println("Invalid Number");
			break;
		}
	}
}

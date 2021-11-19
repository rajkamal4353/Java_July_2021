package com.java_class;

import java.util.Scanner;

public class Day17_16_08_2021_Armstrong_Number {
	
	public static void main(String[] args) {
		
		int rem = 0, ans = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int n = sc.nextInt();
		int t = n;
		
		while(n>0) {
			rem = n%10;
			ans = ans + (rem*rem*rem);
			n = n/10;
		}
		
		if (t==ans) {
			System.out.println("Armstrong Number");
		}
		
		else {
			System.out.println("Not an Armstrong Number");
		}
	}	
	
}


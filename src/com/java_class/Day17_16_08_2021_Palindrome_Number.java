package com.java_class;

import java.util.Scanner;

public class Day17_16_08_2021_Palindrome_Number {
	
	public static void main(String[] args) {
		
		int rem = 0, ans = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int n = sc.nextInt();
		int t = n;
		
		while(n>0) {
			rem = n%10;
			ans = ans * 10 + rem;
			n = n/10;
		}
		
		if (t==ans) {
			System.out.println("Palindrome Number");
		}
		
		else {
			System.out.println("Not an Palindrome Number");
		}
	}
	
}


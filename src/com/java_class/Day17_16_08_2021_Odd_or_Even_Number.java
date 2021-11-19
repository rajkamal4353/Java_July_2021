package com.java_class;

import java.util.Scanner;

public class Day17_16_08_2021_Odd_or_Even_Number {
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
        System.out.println("Enter your Number");  
        
        int m = n.nextInt();
        
        if (m%2==0) {
			System.out.println("Even Number");
		}
        else {
			System.out.println("Odd  Number");
		}
        
	}
	
}

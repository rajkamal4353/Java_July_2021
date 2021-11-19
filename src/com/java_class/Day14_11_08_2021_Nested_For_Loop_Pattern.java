package com.java_class;

public class Day14_11_08_2021_Nested_For_Loop_Pattern {

    public static void main(String[] args) {
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < i; j++) {
			System.out.print("*");
			}
		    System.out.println();	
		}
    }
}
package com.java_class;

public class Day16_13_08_2021_Jumping_Statement_Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i==6 || i==7) {         // || - Logical or Operator ,  && - Logical and Operator
				continue;
			}
			System.out.println(i);
		}
	}
}


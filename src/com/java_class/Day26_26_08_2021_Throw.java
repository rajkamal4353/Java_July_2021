package com.java_class;

public class Day26_26_08_2021_Throw {

	public void vote(int age)throws ArithmeticException {
		
		if (age>=18) {
			System.out.println("able to vote");
		}
		else {
			throw new ArithmeticException();
		}
	}
}

package com.java_class;

public class Day2_21_07_2021_Hierarchical1 extends Day2_21_07_2021_Hierarchical{

	public void son1() {
		System.out.println("raj");
	}
	@Override
	public void mother() {
		super.mother();
	}
	public static void main(String[] args) {
		Day2_21_07_2021_Hierarchical1 c1 = new Day2_21_07_2021_Hierarchical1();
		c1.son1();
		c1.mother();
	}
}

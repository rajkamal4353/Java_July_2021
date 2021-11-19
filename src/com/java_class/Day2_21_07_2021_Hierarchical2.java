package com.java_class;

public class Day2_21_07_2021_Hierarchical2 extends Day2_21_07_2021_Hierarchical{

	private void son2() {
		System.out.println("kamal");
	}
	@Override
	public void mother() {
		super.mother();
	}
	public static void main(String[] args) {
		Day2_21_07_2021_Hierarchical2 c2 = new Day2_21_07_2021_Hierarchical2();
		c2.son2();
		c2.mother();
	}
}

package com.java_class;

public class Day24_24_08_2021_This_Child extends Day24_24_08_2021_Super_Parent{
	
	int a = 2001;
	
	public void add() {
		
	    System.out.println(this.a);
	}
	
	public void value() {
		super.emp();
		this.add();
	}
	
	public static void main(String[] args) {
		
		Day24_24_08_2021_This_Child t = new Day24_24_08_2021_This_Child();
		t.value();	
	}
	
}

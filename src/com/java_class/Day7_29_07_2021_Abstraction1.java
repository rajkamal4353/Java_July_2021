package com.java_class;

public class Day7_29_07_2021_Abstraction1 extends Day7_29_07_2021_Abstraction{

	@Override
	public void emi() {
	System.out.println("bike");
	}
	
    @Override
    public void cod() {
	super.cod();
    }
    
    public static void main(String[] args) {
    	
    Day7_29_07_2021_Abstraction1 a = new Day7_29_07_2021_Abstraction1();
    
    a.emi();
    
    a.cod();
	}
    
}

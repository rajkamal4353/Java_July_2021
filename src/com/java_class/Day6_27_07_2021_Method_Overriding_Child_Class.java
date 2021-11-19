package com.java_class;

public class Day6_27_07_2021_Method_Overriding_Child_Class extends Day6_27_07_2021_Method_Overriding_Parent_Class{
	
	@Override
	public void car(String car) {
	super.car(car);
	}
	@Override
	public void cash(int a) {
	super.cash(a);
	}
    public void bike() {
    	System.out.println("YAMAHA_R15");
    }
    public static void main(String[] args) {
    Day6_27_07_2021_Method_Overriding_Child_Class c = new Day6_27_07_2021_Method_Overriding_Child_Class();
    c.car("AUDI");
    c.cash(6600000);
    c.bike();
	}
    
}

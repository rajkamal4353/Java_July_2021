package com.java_class;

public class Day8_30_07_2021_Interface3 implements Day8_30_07_2021_Interface2, Day8_30_07_2021_Interface1 {

	@Override
	public void emi() {
	System.out.println("car");
	}
    @Override
	public void cod() {
	System.out.println("bike");
	}
    @Override
	public void car() {
	System.out.println("emi");
	}
    @Override
	public void bike() {
	System.out.println("cod");
	}
	public void bus() {
	System.out.println("government");
	}
	
	public static void main(String[] args) {
		Day8_30_07_2021_Interface3 i = new Day8_30_07_2021_Interface3();
		i.emi();
		i.cod();
		i.car();
		i.bike();
		i.bus();
	}
}

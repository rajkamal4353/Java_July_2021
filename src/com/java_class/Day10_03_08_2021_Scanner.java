package com.java_class;

import java.util.Scanner;

public class Day10_03_08_2021_Scanner {
	
	    public static void main(String[] args) {
	    	
		Scanner s = new Scanner(System.in);         // System.in - input access or runtime access
		
		System.out.println("insert your card");
	    String card = s.nextLine();                 // nextLine(); - String /skips nextline when used in center
	    System.out.println(card);
	    
	    System.out.println("enter your pin");
	    int pin = s.nextInt();                     // nextInt(); - integer
	    System.out.println(pin);
	    
	    System.out.println("select your account");
	    String ac = s.next();                      // next - (String & int)
	    System.out.println(ac);
	    
	    }
}

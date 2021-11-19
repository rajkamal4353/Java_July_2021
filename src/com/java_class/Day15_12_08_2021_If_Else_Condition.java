package com.java_class;

import java.util.Scanner;

public class Day15_12_08_2021_If_Else_Condition {
	
	    public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Mark");
		
		int mark = s.nextInt();
		
		if (mark<60) {
			System.out.println("fail");
			}else if (mark>70 && mark<80) {
			     System.out.println("B Grade");
			}else if (mark>80 && mark<90 ) {
			     System.out.println("A Grade");	
			}else {
				 System.out.println("Not Attended");
			}
				
	    }
	    
}	


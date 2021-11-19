package com.java_class;

public class Day26_26_08_2021_Exception_Handling {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
        finally {
        	System.out.println("java");  
	    }	
		
    }
}
				
		
	

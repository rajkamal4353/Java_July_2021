package com.java_class;

public class Day20_19_08_2021_String_Immutable {
	
	public static void main(String[] args) {
		
		String s = "java";
		String s1 = "java";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
	    s = s+s1;
	    
	    System.out.println(s);
	    System.out.println(System.identityHashCode(s));
	}
}

package com.java_class;

public class Day20_19_08_2021_String_Mutable {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("java");
		StringBuffer s1 = new StringBuffer("java");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		s.append(s1);
		
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
}
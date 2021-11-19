package com.java_class;

import java.util.HashSet;
import java.util.Set;

public class Day22_21_08_2021_SET_Hash_Set {
	
	public static void main(String[] args) {
		
		Set<Object> d = new HashSet<Object>();
		
		d.add(90.5);
		d.add(90.6);
		d.add(91.5);
		d.add(90.5);
		d.add(92.5);
		d.add('r');
		d.add("rajkamal");
		
		System.out.println(d);
		
		int size = d.size();
		System.out.println(size);
		
		boolean remove = d.remove('r');
		System.out.println(d);
		
	//  d.clear();
		
	//  System.out.println(d);	
		
		Set<Object> d1 = new HashSet<Object>();
		
		d1.add(56);
		d1.add(58);
		d1.add("Selenium");
		d1.add('k');
		d1.add(50);
		
		System.out.println(d1);
		
		boolean empty = d.isEmpty();
		System.out.println(empty);
		
		boolean equals = d.equals(d1);
		System.out.println(equals);
		
	}
	
}

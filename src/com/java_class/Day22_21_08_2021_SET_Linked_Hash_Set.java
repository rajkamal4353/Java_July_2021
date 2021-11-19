package com.java_class;

import java.util.LinkedHashSet;
import java.util.Set;

public class Day22_21_08_2021_SET_Linked_Hash_Set {

public static void main(String[] args) {
		
		Set<Object> d = new LinkedHashSet<Object>();
		
		d.add(80);
		d.add(81);
		d.add(82);
		d.add(84);
		d.add(83);
		d.add('k');
		d.add("raj");
		
		System.out.println(d);
		
		int size = d.size();
		System.out.println(size);
		
		Object remove = d.remove('k');
		System.out.println(d);
		
		boolean contains = d.contains(83);
		System.out.println(contains);
		
	//  d.clear();
	//  System.out.println(d);	
		
		Set<Object> d1 = new LinkedHashSet<Object>();
		
		d1.add(56);
		d1.add(58);
		d1.add("Selenium");
		d1.add('r');
		d1.add(50);
		
		System.out.println(d1);
		
		boolean empty = d.isEmpty();
		System.out.println(empty);
		
		boolean equals = d.equals(d1);
		System.out.println(equals);
		
	}
}

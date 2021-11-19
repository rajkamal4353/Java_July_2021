package com.java_class;

import java.util.TreeSet;
import java.util.Set;

public class Day22_21_08_2021_SET_Tree_Set {
	
public static void main(String[] args) {
		
		Set<Integer> d = new TreeSet<Integer>();
		
	// Only Integer 
		
		d.add(80);
		d.add(81);
		d.add(82);
		d.add(84);
		d.add(83);
		
		System.out.println(d);
		
		int size = d.size();
		System.out.println(size);
		
		Object remove = d.remove(83);
		System.out.println(d);
		
		boolean contains = d.contains(86);
		System.out.println(contains);
		
	//  d.clear();
	//  System.out.println(d);	
		
		Set<Integer> d1 = new TreeSet<Integer>();
		
		d1.add(56);
		d1.add(58);
		d1.add(50);
		
		System.out.println(d1);
		
		boolean empty = d.isEmpty();
		System.out.println(empty);
		
		boolean equals = d.equals(d1);
		System.out.println(equals);
		
	}

}

package com.java_class;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class Day22_21_08_2021_LIST_Linked_List {
		
	public static void main(String[] args) {
			
		//interface       //class
		List<Object> l = new LinkedList<Object>();
		//parent         //child
			
		l.add(51);        //0-1
		l.add(42);        //1-2
		l.add(51);        //2-3
		l.add(26.26);     //3-4
		l.add('r');       //4-5
		l.add("java");    //5-6
			
		System.out.println(l);
			
		int size = l.size();
		System.out.println(size);
			
		Object object = l.get(3);
		System.out.println(object);
			
		Object set = l.set(5, "selenium");
		System.out.println(l);
			
		Object remove = l.remove(3);
		System.out.println(l);
			
		int indexOf = l.indexOf(51);
		System.out.println(indexOf);
			
		boolean contains = l.contains(51);
		System.out.println(contains);
			
		//	l.clear();
		//	System.out.println(l);
			
		List<Integer> l1 = new LinkedList<Integer>();
			
		l1.add(56);
		l1.add(57);
		l1.add(56);
		l1.add(25);
			
		//	l.addAll(l1);
		//	System.out.println(l1);
			
		//	l.retainAll(l1);
		//	System.out.println(l);
			
		l.removeAll(l1);
		System.out.println(l);
			
		//asc
		
		Collections.sort(l1);
		System.out.println(l1);
		
		//desc
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
			
		boolean empty = l.isEmpty();
		System.out.println(empty);
			
		boolean equals = l.equals(l1);
		System.out.println(equals);
	}
}

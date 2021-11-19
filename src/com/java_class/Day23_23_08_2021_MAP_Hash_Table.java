package com.java_class;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day23_23_08_2021_MAP_Hash_Table {

    public static void main(String[] args) {
		
		Map<Integer,String> m = new Hashtable<Integer, String>();
		
		m.put(1,"core java");
		m.put(2,"hi hello");
		m.put(3,"welcome");
		m.put(3,"b");
		m.put(4,"framework");
		m.put(5,"java");
		m.put(6,"null");
		m.put(7,"null");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
	    String string = m.get(3);
	    System.out.println(string);
	    
	    Set<Integer> keySet = m.keySet();
	    System.out.println(keySet);
	    
	    Collection<String> values = m.values();
	    System.out.println(values);
	    
	    boolean containsKey = m.containsKey(3);
	    System.out.println(containsKey);
	    
	    boolean containsValue = m.containsValue("raj");
	    System.out.println(containsValue);
	    
	    Set<Entry<Integer, String>> entrySet = m.entrySet();
	    for (Entry<Integer, String> entry : entrySet) {
	         System.out.println(entry);
	    }
    }
    
}

package com.java_class;

import java.util.TreeMap;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day23_23_08_2021_MAP_Tree_Map {
	
	public static void main(String[] args) {
		
		Map<Integer,String> m = new TreeMap<Integer, String>();
		
		m.put(1,null);
		m.put(2,null);
		m.put(3,null);
		m.put(3,null);
		m.put(4,null);
		m.put(5,null);
		m.put(4,null);
		m.put(5,null);
		
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
	    
	    boolean containsValue = m.containsValue("null");
	    System.out.println(containsValue);
	    
	    Set<Entry<Integer, String>> entrySet = m.entrySet();
	    for (Entry<Integer, String> entry : entrySet) {
	         System.out.println(entry);
	    }
	}
	
}

package com.java_class;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day23_23_08_2021_MAP_Concurrent_Hash_Map {

	public static void main(String[] args) {
		
	Map<Integer,String> m = new ConcurrentHashMap<Integer, String>();
			
			m.put(1,"i");
			m.put(2,"am");
			m.put(3,"rajkamal");
			m.put(3,"from");
			m.put(4,"neyveli township");
			m.put(5,"tamilnadu");
			m.put(6,"india");
			m.put(7,"country");
			
	        System.out.println(m);
			
			int size = m.size();
			System.out.println(size);
			
		    String string = m.get(6);
		    System.out.println(string);
		    
		    Set<Integer> keySet = m.keySet();  // Get the key values
		    System.out.println(keySet);
		    
		    Collection<String> values = m.values();  // Get the values
		    System.out.println(values);
		    
		    boolean containsKey = m.containsKey(3);
		    System.out.println(containsKey);
		    
		    boolean containsValue = m.containsValue("work");
		    System.out.println(containsValue);
		    
		    Set<Entry<Integer, String>> entrySet = m.entrySet();
		    for (Entry<Integer, String> entry : entrySet) {
		         System.out.println(entry);
		    }
	}
	
}
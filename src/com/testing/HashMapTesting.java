package com.testing;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTesting {

    HashMap<Integer, String> hmap = new HashMap<Integer, String>();

    public void usingHashMap() {
    	hmap.put(10, "First");
    	hmap.put(20, "Second");
    	hmap.put(30, "Third");
    	hmap.put(40, "Fourth");
    	
//    	System.out.println(hmap.get(30));
    	
    	Iterator<Integer> iterator = hmap.keySet().iterator();
    	
    	while(iterator.hasNext()){
    		Integer key = iterator.next();
    		System.out.println("key: " + key + " value: " + hmap.get(key));
    	}
    }
    
	
}

package com.testing.ProjectEuler;

import java.util.ArrayList;
import java.util.Iterator;

public class FindingMultiples {
	
	private ArrayList<Integer> multiples = new ArrayList<Integer>();
	private Integer result = 0;
	
	public int listTotal(int count) {
		collectMultiples(count);
		Iterator<Integer> iterator = multiples.iterator();
		
		while (iterator.hasNext()) {
			this.result += iterator.next();
		}
		
		return this.result;
	}
	
	private void collectMultiples(int count) {
		for (int i = 3; i < count + 1; i++) {
			if (isMultiple(i)) {
				multiples.add(i);
			}
		}
	}
	
	private boolean isMultiple(int i) {
		boolean result = false;
		if (i%3 == 0) {result = true;}
		if (i%5 == 0) {result = true;}
		
		return result;
	}
	
	
}

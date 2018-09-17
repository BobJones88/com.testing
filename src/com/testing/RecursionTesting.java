package com.testing;

public class RecursionTesting {

	int randomInt = 5;
	
	public int testFunc(int counter) {
		
		int i = counter;
		
		System.out.println("Inside the recursion: " + i);
		
		i--;
		
		if (i > 0) {
			testFunc(i);
		}

		
		return i;
		
	}
	
}

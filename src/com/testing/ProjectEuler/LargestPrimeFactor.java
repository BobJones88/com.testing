package com.testing.ProjectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LargestPrimeFactor {

	private Double largestPrimeFactor = 0D;
	private ArrayList<Double> factors = new ArrayList<Double>();
	
	public Double findLargestPrimeFactor(Double num) {
		findFactors(num);
		System.out.println("Factors Found");
		System.out.println(factors.size());
		
		Collections.sort(factors, Collections.reverseOrder());
		Iterator<Double> iterator = factors.iterator();
		
		while(iterator.hasNext()) {
			Double currentValue = iterator.next();
			if(isPrime(currentValue)) {
				this.largestPrimeFactor = currentValue;
				break;
			}
		}
		
		return largestPrimeFactor;
	}
	
	private void findFactors(Double num) {
		for (Double i = 1D; i < num / 2; i = i + 2) {
			if (num%i == 0) {
				factors.add(i);
				System.out.println("Factor Added:" + i);
			}
		}
	}
	
	private boolean isPrime(Double factor) {
		boolean result = true;
		for (int x = 2; x < factor / 2; x++) {
			if(factor%x == 0) {
				result = false; 
				break;}
		}
		return result;
	}
	
}

package com.testing.ProjectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LargestPrimeFactor3 {

	private Double largestPrimeFactor = 0D;
	private Double smallestFactor = 1D;
	
	private ArrayList<Double> factors = new ArrayList<Double>();
	
	public Double findLargestPrimeFactor(Double num) {

		smallestFactor(smallestFactor(num));
		
		findFactors(smallestFactor);
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
		Double half = num / 2;
		
		if (num%2 != 0) {half = half - .5D;}
		
		for (Double i = half; i > 0; i = i - 2) {
			if (num%i == 0) {
				if (i%2 != 0) {
					factors.add(i);
				}
			}
		}
	}
	
	private boolean isPrime(Double factor) {
		boolean result = true;
		for (int x = 3; x < factor / 2; x = x+2) {
			if(factor%x == 0) {
				result = false; 
				break;}
		}
		return result;
	}
	
	private Double smallestFactor(Double num) {
		for (Double j = 3D; j < num / 2; j = j + 2) {
			if(isPrime(j)) {
				if(num%j == 0) {
					this.smallestFactor = num/j;
					break;
				}
			}
		}
		
		return this.smallestFactor;
	}
	
}

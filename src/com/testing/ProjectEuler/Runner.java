package com.testing.ProjectEuler;

public class Runner {
	public static void main(String[] args) {
		FindingMultiples fm = new FindingMultiples();
		System.out.println(fm.listTotal(999));
		
//		LargestPrimeFactor lpf = new LargestPrimeFactor();
//		System.out.println(lpf.findLargestPrimeFactor(13195D));
		
		LargestPrimeFactor3 lpf3 = new LargestPrimeFactor3();
		System.out.println(lpf3.findLargestPrimeFactor(1000423D));
	}
}

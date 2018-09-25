package com.testing.ProjectEuler;

public class Runner {
	public static void main(String[] args) {
		FindingMultiples fm = new FindingMultiples();
		System.out.println(fm.listTotal(999));
		
		LargestPalindrome lp = new LargestPalindrome();
		System.out.println(lp.findLargestPalindrome());
//		System.out.println(lp.isPalindrome(9885889));
	}
}

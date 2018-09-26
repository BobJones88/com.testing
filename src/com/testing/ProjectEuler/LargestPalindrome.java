package com.testing.ProjectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class LargestPalindrome {


	ArrayList<Integer> palindromes = new ArrayList<Integer>();
	
	public int findLargestPalindrome() {
		findAllPalindromes();
		Collections.sort(palindromes, Collections.reverseOrder()); ;
		return palindromes.get(0);
	}
	
	private void findAllPalindromes(){
		int product = 0;
		for(int i = 999; i > 90; i--) {
			for(int j = 999; j > 90; j--) {
				product = i * j;
				if(isPalindrome(product)) {
					palindromes.add(product);
				}
			}
		}
	}	
	
	private boolean isPalindrome(Integer num) {
		String str = num.toString();
		CharSequence str1 = new String();
		CharSequence str2 = new String();
		
		str1 = str.subSequence(0, str.length()/2);
		if(str.length()%2 == 0) {
			str2 = str.subSequence(str.length()/2, str.length());
		}
		else {
			str2 = str.subSequence(str.length()/2+1, str.length());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(str1);

		StringBuilder sb2 = new StringBuilder();	
		sb2.append(str2);
		sb2.reverse();
		
		return Objects.equals(sb.toString(), sb2.toString());
	}
}

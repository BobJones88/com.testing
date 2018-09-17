package com.testing;

public class WriteStringBackwards {

	public char[] Write(String s) {
		
		char[] arrayChar = new char[s.length()];
		char[] newArrayChar = new char[s.length()];
		
		s.getChars(0, s.length(), arrayChar, 0);
		
//		System.out.println(arrayChar);
		
		int i = 0;
		while(i<s.length()){
			newArrayChar[i] = arrayChar[s.length() - 1 - i];
			i++;
		}
		
//		System.out.println(newArrayChar);
		
		return newArrayChar;
	}

	
}

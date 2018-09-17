package com.testing;

/* This method was on average 30 times faster than WriteStringBackwards 
 * It has to iterate half as often, also I would imagine it uses less memory
 * What could I do to continue to speed this up?
 * */

public class WriteStringBackwards2 {

	public char[] Write(String s) {
		
		char[] arrayChar = new char[s.length()];
		char placeHolder;
		
		s.getChars(0, s.length(), arrayChar, 0);
		
//		System.out.println(arrayChar);
		
		int i = 0;
		while(i<s.length()/2){
			placeHolder = arrayChar[i];
			arrayChar[i] = arrayChar[s.length() - 1 - i];
			arrayChar[s.length() - 1 - i] = placeHolder;
			i++;
		}
		
//		System.out.println(newArrayChar);
		
		return arrayChar;
	}
	
}

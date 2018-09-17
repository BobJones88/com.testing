package com.testing;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Using the Java language, have the function VowelSquare(strArr) take the strArr parameter being passed which will 
 * be a 2D matrix of some arbitrary size filled with letters from the alphabet, and determine if a 2x2 square composed 
 * entirely of vowels exists in the matrix. For example: strArr is ["abcd", "eikr", "oufj"] then this matrix looks like the following: 

 * a b c d
 * e i k r
 * o u f j 

 * Within this matrix there is a 2x2 square of vowels starting in the second row and first column, namely, ei, ou. 
 * If a 2x2 square of vowels is found your program should return the top-left position (row-column) of the square, so for this example 
 * your program should return 1-0. If no 2x2 square of vowels exists, then return the string not found. If there are multiple squares of vowels, 
 * return the one that is at the most top-left position in the whole matrix. The input matrix will at least be of size 2x2. 
 */

public class VowelSquare {
	
	public String checkVowels(String[] strArr) {
		ArrayList<Integer> intArrayList1 = new ArrayList<Integer>();
		ArrayList<Integer> intArrayList2 = new ArrayList<Integer>();
		String result = "Error. Vowel Cube Not Found.";
		@SuppressWarnings("unused")
		boolean isUnused = true;
		int y = -1;
		
		outer:
		for(int i = 0; i < strArr.length; i++) { //Iterate through each row

//			System.out.println("Checking Row #" + i);
			char[] charArray = new char[strArr[0].length()];  //Will hold a row at a time
			charArray = strArr[i].toCharArray();
//			listCharArrayContents(charArray);

			
			for(int x = 0; x < (strArr[0].length() - 1); x++) { //See if 0,1 1,2 2,3 are vowels pairs
//				System.out.println("Currently x is: " + x);
				if(charArray[x] == 'a' || charArray[x] == 'e' || charArray[x] == 'i' || charArray[x] == 'o' || charArray[x] == 'u') {
					if(charArray[x+1] == 'a' || charArray[x+1] == 'e' || charArray[x+1] == 'i' || charArray[x+1] == 'o' || charArray[x+1] == 'u') {
						if(i%2 != 0) {intArrayList1.add(x); isUnused = false;}
						else {intArrayList2.add(x);}
					}
				}
			}
			
			if(i > 0) { //Once the outer loop executes once, this is triggered. Checks to see if any of the saved positions match
				
//				System.out.println("IntArray1 Size: " + intArrayList1.size() + " IntArray2 Size: " + intArrayList2.size());
				
				if(intArrayList1.size() > 0  && intArrayList2.size() > 0) {
					for(int j = 0; j < intArrayList1.size(); j++) {
						y = intArrayList2.indexOf(intArrayList1.get(j));
						y = intArrayList2.get(y);
						if(y != -1) {
							result = i-1 + "-" + y;
							break outer;
						}
					}
				}	
//						listContents(intArrayList1, 1);
//						listContents(intArrayList2, 2);
						
						if(i%2 == 0) {intArrayList1.clear(); isUnused = true;}
						else{intArrayList2.clear();}	
			}
						
//			System.out.println("Finished Checking Row #" + i);
//			listContents(intArrayList1, 1);
//			listContents(intArrayList2, 2);
//			System.out.println("");
		}
		
		return result ;
	}
	
	public void listContents(char[] chArray) {
		for(int i = 0; i < chArray.length; i++) {
			System.out.println("Char Array Postion " + i + ": " + chArray[i]);
		}
	}
	
	public void listContents(ArrayList<Integer> ArrList, int x) {
		for(int i = 0; i < ArrList.size(); i++) {
			System.out.println("ArrayList" + x + " Postion " + i + ": " + ArrList.get(i));
		}
	}
	
}
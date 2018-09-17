package com.testing;

/*
 * Coding Challenge:
 * take the str string parameter, which will contain single digit numbers, letters, and question marks, and check if there 
 * are exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your program should return 
 * the string true, otherwise it should return the string false. If there aren't any two numbers that add up to 10 in the string, 
 * then your program should return false as well. 

 * For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks 
 * between 6 and 4, and 3 question marks between 5 and 5 at the end of the string. 
 */

public class StringQuestions {
	
	public boolean checkString(String str){
		
		boolean result = false;
		char[] charArray = new char[str.length()];
		str.getChars(0, str.length(), charArray, 0);
		int[] intArray = new int[str.length()];
		int[] intPositions = new int[str.length()];
		int counter = 0;
			
		for(int i = 0; i < str.length(); i++) {
			int charValue = Character.getNumericValue(charArray[i]);
			
			if(Character.isDigit(charArray[i])){
				intArray[i] = charValue;
				counter++;
				intPositions[counter] = i;

				if(counter > 1) {

					if(intArray[intPositions[counter]] + intArray[intPositions[counter-1]] == 10) {

						int questionMarks = 0;
						for(int x = 1; x < intPositions[counter] - intPositions[counter-1]; x++) {
							boolean bool = Character.getNumericValue(charArray[intPositions[counter-1] + x]) == -1;

							if(bool) {questionMarks++;}
						}

						if(questionMarks == 3) {result = true;}
					}
				}
			}
		}

		return result;
		
	}

}

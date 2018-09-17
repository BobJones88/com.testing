package com.testing;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Using the Java language, have the function ScaleBalancing(strArr) read strArr which will contain two elements, the first being the two positive integer 
 * weights on a balance scale (left and right sides) and the second element being a list of available weights as positive integers. Your goal is to determine 
 * if you can balance the scale by using the least amount of weights from the list, but using at most only 2 weights. For example: if strArr is ["[5, 9]", "[1, 2, 6, 7]"] 
 * then this means there is a balance scale with a weight of 5 on the left side and 9 on the right side. It is in fact possible to balance this scale by adding 
 * a 6 to the left side from the list of weights and adding a 2 to the right side. Both scales will now equal 11 and they are perfectly balanced. 
 * Your program should return a comma separated string of the weights that were used from the list in ascending order, so for this example your program should 
 * return the string 2,6 

 * There will only ever be one unique solution and the list of available weights will not be empty. It is also possible to add two weights to only one side of the 
 * scale to balance it. If it is not possible to balance the scale then your program should return the string not possible. 
 */

public class ScaleBalancing {

	public String balanceScale(ArrayList<Integer[]> strArr) {
		String result = null;
		Integer[] scale = new Integer[2];
		Integer[] weights = new Integer[strArr.get(1).length];
		Integer leftSide; //left side of scale
		Integer rightSide; //right side of scale
		Integer sidePlusWeight;
		ArrayList<Integer> leftSideCombinations = new ArrayList<Integer>();
		ArrayList<Integer> rightSideCombinations = new ArrayList<Integer>();
		ArrayList<Integer> solution = new ArrayList<Integer>();
		
		scale = strArr.get(0);
		weights = strArr.get(1);
		leftSide = scale[0];
		rightSide = scale[1];
		
		leftSideCombinations = calculateCombonations(leftSide, weights);
		rightSideCombinations = calculateCombonations(rightSide, weights);
		
		sidePlusWeight = compareCombonations(leftSideCombinations, rightSideCombinations);
		
		if(leftSide != sidePlusWeight) {solution.add(sidePlusWeight - leftSide);}
		if(rightSide != sidePlusWeight) {solution.add(sidePlusWeight - rightSide);}
		
		Collections.sort(solution);
		
		switch (solution.size()) {
		case 0: result = "String Not Possible";
				break;
		case 1: result = "" + solution.get(0);
				break;
		case 2: result = solution.get(0) + "," + solution.get(1);
				break;
		}
		
		return result;
		
	}
	
	public Integer compareCombonations(ArrayList<Integer> leftSideCombinations, ArrayList<Integer> rightSideCombinations){

//		Iterate through the list and find the solution
//		THIS CODE HAS PROBLEMS. Will not always find the perfect solution. Could reuse weights. Instead, need to create permutations of all possible combinations and compare
		
//		listContents(leftSideCombinations, "left");
//		listContents(rightSideCombinations, "right");
		
		leftSideCombinations.retainAll(rightSideCombinations);  //leftside becomes only the positive matches
		
		Collections.sort(leftSideCombinations); //Need to sort to find the lowest value
		
//		listContents(leftSideCombinations, "left");
		
		return leftSideCombinations.get(0);
		
	}
	
	public ArrayList<Integer> calculateCombonations(Integer scale, Integer[] weights) {
		
		ArrayList<Integer> combinations = new ArrayList<Integer>();
		
		combinations.add(scale); //Include the weight already there
		
		for (int i = 0; i < weights.length; i++) {
			combinations.add(scale + weights[i]); //this will only give combinations of 1:1, need combinations of both 1 and 2 weights each side
			for (int x = 1; x + i < weights.length; x++) {
				combinations.add(scale + weights[i] + weights[i + x]);
			}
			// Need to add recursion
		}
		
		return combinations;
		
	}
	
	public void listContents(ArrayList<Integer> arrList, String side) {
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println("ArrayList" + side + " Postion " + i + ": " + arrList.get(i));
		}
	}
}

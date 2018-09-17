package com.testing;

import java.util.ArrayList;

import com.testing.WriteStringBackwards;

public class TestingWSB {

	public static void main(String[] args) throws Exception {
		String s = "When complete, this string will be backwards.";
		Stopwatch sw = new Stopwatch();
		Stopwatch sw2 = new Stopwatch();
		
		//wsb will use two char[] and write from the original to the new
		sw.start();
		WriteStringBackwards wsb = new WriteStringBackwards();
		System.out.println(wsb.Write(s));
		sw.stop();
		System.out.println("WSB took " + sw.timeInNanoseconds() + " nanoseconds to complete.");
		System.out.println("");
		
		//wsb2 will use a placeholder and require half the iterations
		sw2.start();
		WriteStringBackwards wsb2 = new WriteStringBackwards();
		System.out.println(wsb2.Write(s));
		sw2.stop();
		System.out.println("WSB2 took " + sw2.timeInNanoseconds() + " nanoseconds to complete.");
		System.out.println("");
		
		System.out.println("WSB2 was " + sw.timeInNanoseconds()/sw2.timeInNanoseconds() + " times faster than WSB");
		System.out.println("WSB2 took " + (sw2.time()/sw.time()*100) + "% of the time to complete compared to WSB");
		
		//Uses three arrays. Wonder if I can cut down on the resources if I use a MAP? Use pairs...
		StringQuestions sq = new StringQuestions();
		boolean bool = sq.checkString("arrb6???4xxbl5???eee5");
		System.out.println(bool);
		System.out.println("");
		
		//VowelSquare Challenge
		VowelSquare vs = new VowelSquare();
		String[] strArgs = new String[4];
		strArgs[0] = "ascdd";
		strArgs[1] = "eekrf";
		strArgs[2] = "ouejr";
		strArgs[3] = "giigs";
		System.out.println("First Vowel Cube located at " + vs.checkVowels(strArgs));
		System.out.println("");
		
		//ScaleBalancing
		//TODO - Doesn't work in all scenarios. Need to add recursion
		//	["[5, 9]", "[1, 2, 6, 7]"]
		Integer[] scale = new Integer[] {5, 9};
		Integer[] weights = new Integer[] {1, 2, 6, 7};
		ScaleBalancing sb = new ScaleBalancing();
		ArrayList<Integer[]> scaleAndWeights = new ArrayList<Integer[]>();
		
		scaleAndWeights.add(scale);
		scaleAndWeights.add(weights);
		
		System.out.println(sb.balanceScale(scaleAndWeights));
		System.out.println("");
		
		HashMapTesting hmt = new HashMapTesting();
		hmt.usingHashMap();
		System.out.println("");
		
		ExceptionTesting et = new ExceptionTesting();
		try {
			et.UsingTryBlocks();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("");
	}

}

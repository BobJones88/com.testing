package com.testing;

public class ForLoopExample2 {
	public static void main(String args[]) {
		
		Stopwatch forStopwatch = new Stopwatch();
		forStopwatch.start();
		System.out.println("For Loop Example:");
		for(int i=10; i>0; i--) {
			System.out.println("The value of i is: "+i);
			/* Comment in between lines */
		}
		forStopwatch.stop();
		System.out.println(forStopwatch.time());
		
		Stopwatch whileStopwatch = new Stopwatch();
		whileStopwatch.start();
		System.out.println("While Loop Example:");		
		int i = 10;
		while(i>0) {
			System.out.println("The value of i is: "+i);
			i--;
		}
		whileStopwatch.stop();
		System.out.println(whileStopwatch.time());
	}

}

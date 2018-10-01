package com.testing;

public class TestingLists {

	public static void main(String[] args) {
		//STring 0, to 50k
		Stopwatch sw = new Stopwatch();
		
		sw.start();
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < 50000; i++) {
			str.append(i + ", ");
		}
		sw.stop();
		
		System.out.println(sw.time());
		System.out.println(str.length());
	}
	


}

package com.testing;

import java.io.*;

public class ExceptionTesting {

	public void UsingTryBlocks() throws Exception {
		
		File file = new File("C:\\Users\\Bob\\Desktop\\CS Codes.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		try {
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			if(br != null) {
				try {
					br.close();
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		}
		
	}
	
}

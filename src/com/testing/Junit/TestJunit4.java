package com.testing.Junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit4 {

	String message = "Hello World";
	MessageUtil2 mu2 = new MessageUtil2(message);
	
	@Test
	public void testPrintMessage() {
		assertEquals(message, mu2.printMessage());
	}
	
}

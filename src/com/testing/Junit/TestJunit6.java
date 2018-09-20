package com.testing.Junit;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit6 {

   String message = "Robert";	
   MessageUtil3 messageUtil3 = new MessageUtil3(message);

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil3.salutationMessage());
   }
}
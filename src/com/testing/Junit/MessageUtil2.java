package com.testing.Junit;

/*
* This class prints the given message on console.
*/

public class MessageUtil2 {

   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtil2(String message){
      this.message = message;
   }
      
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
	
}  
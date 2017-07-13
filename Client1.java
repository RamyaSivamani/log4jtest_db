package com.kgfsl.log4jtest;
import org.apache.log4j.Logger;

 
public class Client1 {
 
  static Logger l = Logger.getLogger("Name:");
 
  public static void main(String[] args) {	    
       l.fatal("This is the fatal message..");
       l.info("This is the info message..");
       l.warn("This is the warn message..");
       l.debug("This is the debug message..");
	  
  }
}
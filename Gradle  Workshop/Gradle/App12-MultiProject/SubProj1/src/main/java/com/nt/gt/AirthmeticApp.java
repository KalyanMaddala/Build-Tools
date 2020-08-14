package com.nt.gt;
public class AirthmeticApp{
 
   public  int sum(int x, int y){
    try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
          System.out.println("oracle driver loaded");
     }
     catch(Exception e){
          e.printStackTrace();
          System.out.println("oracle driver not loaded");
       }
      return x+y;
    }
 
 }


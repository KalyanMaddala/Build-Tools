package com.nt.gt1;
public class LogicalApp{
 
   public  String findBig(int x, int y){
         try{
      Class.forName("com.mysql.jdbc.Driver");
          System.out.println("mysql driver loaded");
     }
     catch(Exception e){
          e.printStackTrace();
          System.out.println("mysql driver not loaded");
       }

      if(x<y)
              return  y+" is big";
      else if(y<x)
               return x+" is big";
       else
              return "both are equal";
    }
 }


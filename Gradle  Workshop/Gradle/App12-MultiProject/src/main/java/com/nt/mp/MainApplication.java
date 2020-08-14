package com.nt.mp;

import com.nt.gt.AirthmeticApp;
import com.nt.gt1.LogicalApp;

public class  MainApplication{

  public static void main(String args[]){
      AirthmeticApp app1=null;
      LogicalApp app2=null;
      app1=new AirthmeticApp();
       app2=new LogicalApp();   
      System.out.println("sum is"+app1.sum(10,20));
       System.out.println("Big Value::"+app2.findBig(10,20));
  }
}

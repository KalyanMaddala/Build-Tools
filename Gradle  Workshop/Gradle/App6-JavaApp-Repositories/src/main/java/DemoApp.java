//DemoApp.java
package com.nt.java;
public class DemoApp
{
	public int sum(int x,int y){
		return x+y;
	}
	public int sub(int x,int y){
		return x-y;
	}


	public static void main(String args[]){
		  DemoApp app=new DemoApp();
		  System.out.println("sum::"+app.sum(14,26));
		  System.out.println("sub::"+app.sub(14,26));

		  try{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  System.out.println("jdbc driver class is loaded");
		  }
		  catch(ClassNotFoundException cnfe){
			   cnfe.printStackTrace();
		  }
		  
	}//main
}//class
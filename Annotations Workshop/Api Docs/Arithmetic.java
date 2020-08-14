package com.nt.test;
/**This is given to perform <b> arithmetic operations </b> like <i> Add,Sub, Mul and Div</i> for both<u> numeric values and floating point values</u>.
@author Mr.Kalyan
@since 1998
@see java.lang.Math

*/
public class Arithmetic{
/**holds PI values as Math constant value*/
   private static final float PI=3.14f;
 /**
   gives object of arithmetic class
*/
public  Arithmetic(){
}
/**
<b>performs addition of two numberss</b>
@param x  holds first value
@param y  holds second value
@return gives addition value
*/
public int add(int x,int y){
      return x+y;
    }
}

import org.junit.*;
import static  org.junit.Assert.*;
import  com.nt.java.DemoApp;

public class AllTests
{

     @Test
	public  void testSumWithPositives(){
		 DemoApp app1=new DemoApp();
		 int expected=30;
		 int actual=app1.sum(10,20);
		 assertEquals("test1",expected,actual);
	}

	 @Test
	public  void testSumWithNegetives(){
		 DemoApp app1=new DemoApp();
		 int expected=-30;
		 int actual=app1.sum(-10,-20);
		 assertEquals("test2",expected,actual);
	}

	 @Test
	public  void testSumWithZeros(){
		 DemoApp app1=new DemoApp();
		 int expected=0;
		 int actual=app1.sum(0,0);
		 assertEquals("test3",expected,actual);
	}

	     @Test
	public  void testSubWithPositives(){
		 DemoApp app1=new DemoApp();
		 int expected=-10;
		 int actual=app1.sub(10,20);
		 assertEquals("test4",expected,actual);
	}

	 @Test
	public  void testSubWithNegetives(){
		 DemoApp app1=new DemoApp();
		 int expected=10;
		 int actual=app1.sub(-10,-20);
		 assertEquals("test5",expected,actual);
	}

	 @Test
	public  void testSubWithZeros(){
		 DemoApp app1=new DemoApp();
		 int expected=0;
		 int actual=app1.sub(0,0);
		 assertEquals("test6",expected,actual);
	}

}
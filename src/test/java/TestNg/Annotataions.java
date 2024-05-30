package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotataions {
	
  @Test
  public void testcases1() {
	  System.out.println("this is my test cses1 -----");
  }
  
  @Test
  public void testcases2() {
	  System.out.println("this is my test cses2 -----");
  }
  
  @BeforeMethod
  public void inittest() {
	  System.out.println("before method");
  }
  
  @AfterMethod
  public void clenauptest() {
	  System.out.println("after");
  }
}

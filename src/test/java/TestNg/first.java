package TestNg;

import org.testng.annotations.Test;

public class first {
	
  @Test(priority = 10)
  public void CMyFirstTest() {
	  System.out.println("First test");
  }
  @Test(enabled = false)
  public void AMysecondTest(){
	  System.out.println("My senond test");
  }
  
  @Test(priority = 5)
  public void BMytirdTest(){
	  System.out.println("My THIRD test");
  }
}
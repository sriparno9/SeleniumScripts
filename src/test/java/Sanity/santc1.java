package Sanity;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class santc1 {
  @Test
  public void sanitytestcase1() {
	  System.out.println("exevuting - sanitytestcase");
  }
  
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("executinh beforemethos in san tc 1");
  }
  
  @AfterMethod
  public void afteremethod() {
	  System.out.println("executinh aftermethod in san tc 1");
  }
}

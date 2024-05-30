package refression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class regtc1 {
  @Test
  public void regressiontestcase1() {
	  System.out.println("executinh regressiontestcase1");
  }
  
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("executinh regression in  tc 1");
  }
  
  @AfterMethod
  public void afteremethod() {
	  System.out.println("executinh regression in  tc 1");
  }
}

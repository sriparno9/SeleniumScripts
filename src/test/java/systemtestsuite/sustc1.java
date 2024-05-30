package systemtestsuite;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sustc1 {
  @Test
  public void systemtestcase1() {
	  System.out.println("executinh systemtestcase1");
  }
  
  @BeforeTest
  public void beforemethod() {
	  System.out.println("executinh system in  tc 1");
  }
  
  @AfterTest
  public void afteremethod() {
	  System.out.println("executinh system in  tc 1");
  }
}
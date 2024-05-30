package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class using_test {
	WebDriver driver;
	String expectedtitle = "Guru99 Bank Home Page";
	String expectedurl ="https://demo.guru99.com/v4/";
	
  @Test
  public void validatetitle() {
	  String actualtitle = driver.getTitle();
	  boolean results = expectedtitle.equals(actualtitle);
	  Assert.assertTrue(results);
  }
  
  @Test
  public void checkurl(){
	  String actualurl = driver.getCurrentUrl();
	  boolean results = expectedurl.equals(actualurl);
	  Assert.assertTrue(results);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/v4/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

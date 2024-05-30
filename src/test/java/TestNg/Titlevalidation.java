package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Titlevalidation {
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
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/v4/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

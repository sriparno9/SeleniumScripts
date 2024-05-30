package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testvalid {
	WebDriver driver;
	String expectedtitle = "Guru99 Bank Home Page";
	
  @Test
  public void validTitle() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/v4/");
	  
	  String actualtitle = driver.getTitle();
	  boolean results = expectedtitle.equals(actualtitle);
	  Assert.assertTrue(results);
	  
	  
	  
  }
}

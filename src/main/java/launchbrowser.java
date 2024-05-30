import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.navigate().to("https://amazon.in");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Amazon.in"))
		    System.out.println("title matches");
		else
			System.out.println(title);
		
//		String tagname =" ";
//		tagname = driver.findElement(By.cssSelector(tagname))
		
	}

}

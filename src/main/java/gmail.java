import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class gmail {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.gmail.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("identifierId")).sendKeys("sriparnodas@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and text()='Next']")).click();
	Thread.sleep(2000);
	
	
	WebElement element = driver.findElement(By.className("VfPpkd-vQzf8d"));
	if (element.isDisplayed() && element.isEnabled()) {
	    element.click();
	} else {
	    // Handle the case when the element is not interactable
	}
	

	
	String at = driver.getTitle();
	String et = "gamil";
	driver.close();
	
	if(at.equalsIgnoreCase(et))
	{
		System.out.println("Test Sucessfull");
	}
	else
	{
		System.out.println("Test Fail");
	}


}}
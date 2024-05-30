//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowExample {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		String parentWindowHandle = driver.getWindowHandle();
		
		for(String windowHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(windowHandle);
			if(driver.getTitle().equals("Child Window Title")) {
				break;
			}
		}
		
//		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sriparnodas@gmail.com");
//		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		
		driver.findElement(By.name("emailid")).sendKeys("sriparnodas@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
		driver.switchTo().window(parentWindowHandle);
		
		String parentWindowUrl = driver.getCurrentUrl();
		System.out.println("Parent Window URL: " + parentWindowUrl);
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f1");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("POCO")).click();
		
		driver.navigate().to("https://edureka.co/blog");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("sriparnodas@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		// TODO Auto-generated method stub

	}

}

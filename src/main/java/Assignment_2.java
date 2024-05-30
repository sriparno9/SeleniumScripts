import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_2 {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.34.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.browserstack.com/");
        System.out.println("brower open");

        WebElement developerElement = driver.findElement(By.id("developers-dd-toggle"));

        Actions actions = new Actions(driver);

        actions.moveToElement(developerElement).perform();
        
//click on 'Documentation' option
        WebElement codeSamplesElement = driver.findElement(By.xpath("//*[@id=\"developers-dd-menu\"]/div/div[1]/a/span"));
        codeSamplesElement.click();
        System.out.println("clicked");

        driver.quit();
    }
}
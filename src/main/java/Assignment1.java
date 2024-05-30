import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[5]/label"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        
        //WebElement colorsDropdown = driver.findElement(By.cssSelector("label[for='colors']"));
        WebElement colorsDropdown = driver.findElement(By.id("colors"));

        Select selectColors = new Select(colorsDropdown);

        selectColors.selectByValue("blue");
        selectColors.selectByVisibleText("Yellow");
        
        Thread.sleep(3000);

        driver.quit();
    }
}
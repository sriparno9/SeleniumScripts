import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumscript {
    public static void main(String[] args) throws InterruptedException {
        //System.out.print("hello");
        System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edureka.co");
        WebElement day1 = driver.findElement(By.id("search-input"));
        Select oSelect = new Select(day1);
        
//        driver.get("https://www.facebook.co");
//        
//        driver.manage().window().maximize();
//        WebElement day1 = driver.findElement(By.id("day"));
//        Select oSelect = new Select(day1);
//        
//        Thread.sleep(3000);
//        
//        oSelect.selectByIndex(30);
//        WebElement months = driver.findElement(By.id("month"));
//        Select month_m1 = new Select(months);
//        
//        Thread.sleep(3000);
//        
//        month_m1.selectByVisibleText("Sept");
//        WebElement year_y = driver.findElement(By.id("year"));
//        Select year1 = new Select(year_y);
//        
//        Thread.sleep(3000);
//        
//        year1.selectByValue("1977");

        
    }
}
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//public class Check_validate {
//     WebDriver driver;
//     
//
//    @BeforeTest
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @AfterTest
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Test
//    public void testPresenceOfOtherLanguagesLink() {
//        
//        driver.get("https://www.selenium.dev/downloads/");
//        WebElement linkElement = driver.findElement(By.linkText("other languages exist"));
//        Assert.assertTrue(linkElement.isDisplayed(), "Other languages link is not present");
//    }
//
//    @Test
//    public void testCurrentURL() {
//        driver.get("https://www.selenium.dev/downloads/");
//        String currentURL = driver.getCurrentUrl();
//        Assert.assertEquals(currentURL, "https://www.selenium.dev/downloads/", "URL is not matching");
//    }
//}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Check_validate {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testPresenceOfOtherLanguagesLink() {
        driver.get("https://www.selenium.dev/downloads/");
        WebElement linkElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("other languages exist")));
        Assert.assertTrue(linkElement.isDisplayed(), "Other languages link is not present");
        
    }

    @Test
    public void testCurrentURL() {
        driver.get("https://www.selenium.dev/downloads/");
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertEquals(currentURL, "https://www.selenium.dev/downloads/", "URL is not matching");
    }
}
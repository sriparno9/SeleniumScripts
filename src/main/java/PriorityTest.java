import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class PriorityTest {
     WebDriver driver;

    @BeforeMethod
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	driver.get("https://www.selenium.dev/downloads/");        
    }

    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }

    @Test(priority = 1)
    public void testTitle() 
    {
        String expectedTitle = "Downloads | Selenium";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
    }

    @Test(priority = 2 )
    public void testDisabled1() {
    	System.out.println(" included");
    }

    @Test
    public void testDisabled2() {
    	System.out.println("be included");
    }

    @Test(priority = 4, enabled = false)
    public void testDisabled3() {
        System.out.println("not to be included");
    }

    @Test(priority = 5)
    public void testEnabled() {
    	System.out.println(driver.getCurrentUrl());
        
    }
}
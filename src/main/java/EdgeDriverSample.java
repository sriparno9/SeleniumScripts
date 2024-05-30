import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class EdgeDriverSample {
    public static void main(String[] args) throws Exception {
       // EdgeDriver driver = new EdgeDriver();
       // try {
           // driver.navigate().to("https://bing.com");

//            WebElement element = driver.findElement(By.id("sb_form_q"));
//            element.sendKeys("WebDriver");
//            element.submit();
            
            System.setProperty("webdriver.edge.verboseLogging", "true");
            EdgeDriverService service = EdgeDriverService.createDefaultService();

            EdgeDriver driver1 = new EdgeDriver(service);

            Thread.sleep(5000);
//        } finally {
//            
//        }
    }
}
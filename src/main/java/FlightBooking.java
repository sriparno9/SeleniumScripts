import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FlightBooking {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

//        
//
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement roundTrip = driver.findElement(By.id("RoundTrip"));
        roundTrip.click();
        Thread.sleep(2000);

        WebElement departure = driver.findElement(By.id("FromTag"));
        departure.click();
        departure.sendKeys("fra");
        Thread.sleep(4000);

        List<WebElement> citiesDeparture = driver.findElements(By.xpath("//li[@class='list']"));
        for (WebElement city : citiesDeparture) {
            if (city.getText().contains("FRA")) {
                city.click();
                break;
            }
        }
        Thread.sleep(3000);

        WebElement arrival = driver.findElement(By.id("ToTag"));
        arrival.click();
        arrival.sendKeys("san");
        Thread.sleep(4000);

        List<WebElement> citiesArrival = driver.findElements(By.xpath("//li[@class='list']"));
        for (WebElement city : citiesArrival) {
            if (city.getText().contains("SFO")) {
                city.click();
                break;
            }
        }
        Thread.sleep(3000);

        WebElement departureDate = driver.findElement(By.xpath("//td[@data-month='9']/a[text()='2']"));
        departureDate.click();
        Thread.sleep(2000);

        WebElement nextButton = driver.findElement(By.xpath("//a[@class='nextMonth ']"));
        nextButton.click();

        WebElement returnDate = driver.findElement(By.xpath("//td[@data-month='11']/a[text()='21']"));
        returnDate.click();
        Thread.sleep(2000);

        WebElement adults = driver.findElement(By.id("Adults"));
        Select adultsDropdown = new Select(adults);
        adultsDropdown.selectByIndex(1);
        Thread.sleep(2000);

        WebElement children = driver.findElement(By.id("Childrens"));
        Select childrenDropdown = new Select(children);
        childrenDropdown.selectByValue("3");
        Thread.sleep(2000);

        WebElement moreOptions = driver.findElement(By.id("MoreOptionsLink"));
        moreOptions.click();
        Thread.sleep(1000);

        WebElement classOfTravel = driver.findElement(By.id("Class"));
        Select classDropdown = new Select(classOfTravel);
        classDropdown.selectByVisibleText("Premium Economy");
        Thread.sleep(2000);

        WebElement searchFlights = driver.findElement(By.id("SearchBtn"));
        searchFlights.click();

        Thread.sleep(2000);

        WebElement nonStopCheckbox = driver.findElement(By.xpath("//p[text()='Non-stop']"));
        nonStopCheckbox.click();
        Thread.sleep(2000);

        WebElement currency = driver.findElement(By.xpath("//span[@class='fs-2 c-inherit']"));
        currency.click();
        Thread.sleep(2000);

        WebElement usd = driver.findElement(By.xpath("//span[text()='US Dollar']"));
        usd.click();
        Thread.sleep(2000);

        WebElement firstFlight = driver.findElement(By.xpath("//div[@class='col-19']/div[2]/div[7]/div[1]/div[1]/div[2]/div[4]/button"));
        firstFlight.click();
        Thread.sleep(2000);

        String parentWindow = driver.getWindowHandle();
        for (String childWindow : driver.getWindowHandles()) {
            driver.switchTo().window(childWindow);
        }
        Thread.sleep(10000);

        WebElement continueBooking = driver.findElement(By.id("itineraryBtn"));
        continueBooking.click();
        Thread.sleep(2000);

        WebElement continueBooking2 = driver.findElement(By.id("LoginContinueBtn_1"));
        continueBooking2.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
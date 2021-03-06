package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class HomePage {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        String amazonUrl = "https://www.amazon.com";
        String productName = "Mask";
        String searchBoxLocator = "twotabsearchtextbox";
        String searchButtonLocator = "nav-search-submit-button";

        String chromeDriverPath = "BrowserDriver/chromedriver.exe";
//        String fireFoxDriverPath = "BrowserDriver/geckodriver.exe";

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);

//        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
//        URL url = new URL("https://www.amazon.com");

        // Hardcoded url
//        driver.get("https://www.amazon.com");

        // Using variable for url
        driver.get(amazonUrl);

        // Makes window fullscreen
//        driver.manage().window().fullscreen();

        // Will keep window fullscreen even after clicking
        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        driver.manage().deleteAllCookies();

        // Clicking todays deals
        // Using linktext
//        driver.findElement(By.linkText("Today's Deals")).click();

        // X path
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();

        // Search for mask in search bar
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(searchButtonLocator)).click();

//        driver.findElement(By.id("nav-xshop-container")).click();

        // Wait time
        Thread.sleep(3000);

        // Close window
        driver.close();


    }

}

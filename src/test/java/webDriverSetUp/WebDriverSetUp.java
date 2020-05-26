package webDriverSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.concurrent.TimeUnit;

public class WebDriverSetUp {

    protected static WebDriver driverFirefox, driverChrome;

    protected static void setUpFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "/Users/igor_shved/Documents/Java/libraries/webDrivers/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-extensions","--disable-notifications");
        driverFirefox = new FirefoxDriver(options);
        driverFirefox.manage().window().maximize();
        driverFirefox.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    protected static void setUpChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/igor_shved/Documents/Java/libraries/webDrivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions","--disable-notifications");
        driverChrome = new ChromeDriver(options);
        driverChrome.manage().window().maximize();
        driverChrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}

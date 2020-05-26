package webDriverSetUp;

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class FirefoxDriverTestBase {

    protected static WebDriver firefoxDriver;

    @Before
    public void SetUpChromedriver(){
        System.setProperty("webdriver.gecko.driver","/Users/igor_shved/Documents/Java/libraries/webDrivers/geckodriver");
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().window().maximize();
        firefoxDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void quitChromeDriver() throws InterruptedException {
        Thread.sleep(3000);
        firefoxDriver.quit();
    }
}

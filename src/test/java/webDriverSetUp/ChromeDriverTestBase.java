package webDriverSetUp;

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ChromeDriverTestBase {

    protected static WebDriver chromeDriver;

    @Before
    public void SetUpChromedriver(){
        System.setProperty("webdriver.chrome.driver","/Users/igor_shved/Documents/Java/libraries/webDrivers/chromedriver");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void quitChromeDriver() throws InterruptedException {
        Thread.sleep(3000);
        chromeDriver.quit();
    }
}

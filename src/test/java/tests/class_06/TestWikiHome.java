package tests.class_06;

import pageObjects.class_06.WikipediaHomePage;
import webDriverSetUp.WebDriverSetUp;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class TestWikiHome extends WebDriverSetUp {

    private WebElement ChromeContentWebEl, FirefoxContentWebEl;

    @BeforeClass
    public static void chromeDriverSetUp(){
        setUpChromeDriver();
        setUpFirefoxDriver();
    }

    @AfterClass
    public static void quitWebDrivers() throws InterruptedException {
        Thread.sleep(2000);
        driverChrome.quit();
        driverFirefox.quit();
    }

    @Test
    public void testWikiHomeWithChrome() {
        WikipediaHomePage wikiHome = new WikipediaHomePage(driverChrome);
        wikiHome.openHomePage();
        ChromeContentWebEl = wikiHome.getContentWebElement();
    }

    @Test
    public void testWikiHomeWithFirefox(){
        WikipediaHomePage wikiHome = new WikipediaHomePage(driverFirefox);
        wikiHome.openHomePage();
        FirefoxContentWebEl = wikiHome.getContentWebElement();
    }

    @Test
    public void assertContentWebEl(){
        try {
            Assert.assertEquals(ChromeContentWebEl, FirefoxContentWebEl);
            System.out.println("Element with id = 'content' is equal for both browser drivers.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
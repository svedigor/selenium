package tests.class_06;

import pageObjects.class_06.WallaHomePage;
import webDriverSetUp.ChromeDriverTestBase;
import org.junit.Assert;
import org.junit.Test;

public class TestWallaHome extends ChromeDriverTestBase {
    @Test
    public void wallaHomePage(){

        String expectedTitle = "וואלה! NEWS - האתר המוביל בישראל - עדכונים מסביב לשעון";

        String expectedUrl = "https://www.walla.co.il/";

        WallaHomePage wallaHomePage = new WallaHomePage(chromeDriver);

        Assert.assertEquals(expectedTitle, wallaHomePage.getTitle());

        Assert.assertEquals(expectedUrl,wallaHomePage.getURL());
    }
}

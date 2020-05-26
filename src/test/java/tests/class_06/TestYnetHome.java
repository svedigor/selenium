package tests.class_06;

import pageObjects.class_06.YnetHomePage;
import webDriverSetUp.FirefoxDriverTestBase;
import org.junit.Assert;
import org.junit.Test;

public class TestYnetHome extends FirefoxDriverTestBase {
    @Test
    public void ynetHomePage(){

        String expectedTitle = "ynet - חדשות, כלכלה, ספורט, בריאות";

        String expectedUrl = "https://www.ynet.co.il/home/0,7340,L-8,00.html";

        YnetHomePage ynetHomePage = new YnetHomePage(firefoxDriver);

        Assert.assertEquals(expectedTitle, ynetHomePage.getTitle());

        Assert.assertEquals(expectedUrl,ynetHomePage.getURL());

    }
}

package tests.class_06;

import pageObjects.class_06.WikipediaHomePage;
import webDriverSetUp.ChromeDriverTestBase;
import org.junit.Test;

public class TestWikiHome extends ChromeDriverTestBase {

    @Test
    public void testWikiHome() {
        WikipediaHomePage wikiHome = new WikipediaHomePage(chromeDriver);
        wikiHome.openHomePage();
        wikiHome.printContendWebElement();
    }
}

package pageObjects.class_06;

import org.openqa.selenium.WebDriver;

public class YnetHomePage {

    private WebDriver driver;
    private String HomePageURL = "http://www.ynet.co.il";

    public YnetHomePage(WebDriver driver){
        this.driver = driver;
        driver.get(HomePageURL);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}

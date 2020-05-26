package pageObjects.class_06;

import org.openqa.selenium.WebDriver;

public class WallaHomePage {

    private WebDriver driver;
    private String homePageURL = "http://www.walla.co.il";

    public WallaHomePage(WebDriver driver){
        this.driver = driver;
        driver.get(homePageURL);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
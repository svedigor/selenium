package pageObjects.class_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WikipediaHomePage{

    private WebDriver driver;
    private String homePageURl = "https://en.wikipedia.org/";

    public WikipediaHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "content")
    WebElement content;

    public void openHomePage(){
        driver.get(homePageURl);
    }

    public void printContendWebElement(){
        System.out.println(content);
    }
}

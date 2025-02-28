package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void URLLaunch(String strURL){
        driver.manage().window().maximize();
        driver.get(strURL);

    }

    public void enterValue(WebElement element,String strValue){
        element.sendKeys(strValue);
    }

    public void click(WebElement element){
        element.click();
    }
}

package App.Page;

import Helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {

public WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
    }

@FindBy(id = "email")
public static WebElement txtEmail;

@FindBy(name = "password")
public static WebElement txtPassword;

@FindBy(xpath="//button[text()='Login']")
public static WebElement btnLogin;

@FindBy(xpath = "//div[@class='user_profile_circle  no_halo']")
public static WebElement btnLogo;

@FindBy(xpath = "//li[text()='Logout']")
public static WebElement txtLogout;

@FindBy(xpath = "//p[text()='Leads']")
public static WebElement txtLead;



public void launchURL(String strURL){
    URLLaunch(strURL);
}

public void enterUserNameAndPassword(String strUserName, String strPassword){
enterValue(txtEmail,strUserName);
enterValue(txtPassword,strPassword);

}

public void clickLoginButton(){
    click(btnLogin);
}

public boolean verifyResult(){
    boolean blnResul = true;
    return blnResul;
}

public void Logout() throws InterruptedException {
    Thread.sleep(5000);
    btnLogo.click();
    Thread.sleep(5000);
    txtLogout.click();

}

public boolean verifyLeadScreen() throws InterruptedException {
    Thread.sleep(10000);
    txtLead.isDisplayed();
    return true;
}

}

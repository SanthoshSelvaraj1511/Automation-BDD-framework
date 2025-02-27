package App.Page;

import Helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends BasePage {

    public WebDriver driver;

    public SignupPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//h3[text()='Login']")
    public static WebElement txtLogin;

    @FindBy(xpath = "//a[text()='Sign Up']")
    public static WebElement txtSignup;

    @FindBy(xpath = "//button[text()='Lets Go']")
    public static WebElement btnLetsGo;

    @FindBy(xpath = "//h1[text()='Tell Us About Your Business']")
    public static WebElement txtAboutYourBusiness;

    public boolean verifyLoginScreen(){
        txtLogin.isDisplayed();
        return true;
    }

    public void clickLetsGoButton(){
        btnLetsGo.click();
    }

    public void clickSignUp(){
        txtSignup.click();
    }

    public boolean verifyAboutYourBusinessPage(){
        txtAboutYourBusiness.isDisplayed();
        return true;
    }

    public boolean verifiedSignUpPage(){
        System.out.println("Verified");
        return true;
    }

}

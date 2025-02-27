package App.Step;

import App.PageContainer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignupStep {
     public PageContainer pageContainer;

     public SignupStep(PageContainer pageContainer){
       this.pageContainer = pageContainer;
     }


    @Given("I am on login page")
    public void iAmOnLoginPage() {
        Assert.assertTrue(pageContainer.signupPage.verifyLoginScreen());
    }

    @When("I click sign up button")
    public void iClickSignUpButton() {
        pageContainer.signupPage.clickSignUp();
    }

    @Given("I am on sign up screen")
    public void iAmOnSignUpScreen() {
        pageContainer.signupPage.verifiedSignUpPage();
    }

    @When("I click on lets Go button")
    public void iClickOnLetsGoButton() {
        pageContainer.signupPage.clickLetsGoButton();
    }

    @Then("I navigate to tell us about your business page")
    public void iNavigateToTellUsAboutYourBusinessPage() {
        Assert.assertTrue(pageContainer.signupPage.verifyAboutYourBusinessPage());
    }
}

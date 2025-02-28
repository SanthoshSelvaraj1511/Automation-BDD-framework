package App.Step;


import App.PageContainer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStep {

    private PageContainer pageContainer;
    public LoginStep(PageContainer pageContainer) {
        this.pageContainer = pageContainer;
    }


    @And("I enter the {string} and {string}")
    public void iEnterTheAnd(String strUserName, String strPassword) {
        pageContainer.loginPage.enterUserNameAndPassword(strUserName, strPassword);
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
        pageContainer.loginPage.clickLoginButton();
    }

    @Then("I should see the result")
    public void iShouldSeeTheResult() {
        Assert.assertTrue(pageContainer.loginPage.verifyResult());
    }

    @Given("I Launch the {string}")
    public void iLaunchThe(String strUrl) {
        pageContainer.loginPage.launchURL(strUrl);

    }

    @Given("I am on leads screen")
    public void iAmOnLeadsScreen() throws InterruptedException {
        Assert.assertTrue(pageContainer.loginPage.verifyLeadScreen());
    }

    @When("I click logout button")
    public void iClickLogoutButton() throws InterruptedException {
        pageContainer.loginPage.Logout();
    }
}

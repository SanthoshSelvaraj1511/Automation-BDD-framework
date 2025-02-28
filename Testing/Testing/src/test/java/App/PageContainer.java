package App;

import App.Page.LoginPage;
import App.Page.SignupPage;
import Utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class PageContainer {
    public static LinkedHashMap<String, String> printTestDataMap = new LinkedHashMap<String, String>();
    public static Scenario myScenario;
    public WebDriver driver;
    public LoginPage loginPage;
    public SignupPage signupPage;

     public PageContainer(){
         driver = DriverFactory.getDriver();
         initPage();
     }

     public void initPage(){
         loginPage = new LoginPage(driver);
         signupPage = new SignupPage(driver);
     }

    public static String getCurrentDate(String strFormat) {
        DateFormat dateFormat = new SimpleDateFormat(strFormat);
        Date date = new Date();
        return dateFormat.format(date);
    }

    @Before
    public void before(Scenario scenario1) {
        printTestDataMap.clear();
        myScenario = scenario1;
        System.out.println("Scenario Name: " + myScenario.getName());
    }

   @After
    public void after(Scenario scenario) {
        if (printTestDataMap.size() > 0) {
            for (Map.Entry<String, String> entry : printTestDataMap.entrySet()) {
                scenario.log(entry.getKey().concat(": ").concat(entry.getValue()));
            }
        }

        System.out.println("Scenario Completed at :: " + getCurrentDate("MM/dd/yy hh:mm:ss aaa"));
        scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),
                "image/png", "");
        System.out.println("Scenario Name: " + scenario.getName());
        System.out.println("Scenario Status: " + scenario.getStatus());
    }
}













//PicoContainer is used to handle dependency injection,
// allowing for easy management of WebDriver and page objects,
// promoting reusability and flexibility in tests.
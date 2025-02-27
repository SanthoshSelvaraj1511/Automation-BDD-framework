package App.runner;

import App.PageContainer;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
tags = "@test",
glue = {"App"},
plugin = {
        "pretty",
//        "json:target/cucumber-reports/Cucumber.json",
//        "html:target/cucumber-reports/Cucumber.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
monochrome = true)
public class Runner extends AbstractTestNGCucumberTests {

}

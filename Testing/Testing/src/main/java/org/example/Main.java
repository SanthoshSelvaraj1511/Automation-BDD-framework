package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement elmnt = driver.findElement(By.xpath("//a[@aria-label='Amazon']"));
        Thread.sleep(3000);
        Assert.assertTrue(elmnt.isDisplayed());
        driver.quit();

}}
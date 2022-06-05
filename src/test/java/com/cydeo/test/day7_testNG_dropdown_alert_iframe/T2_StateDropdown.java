package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_StateDropdown {

    WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void stateDropdownTest() throws InterruptedException {

        Select stateDropdown = new Select(driver.findElement(By.id("state")));

        //        3. Select Illinois with selectByValue()
        Thread.sleep(3000);
        stateDropdown.selectByValue("IL");


//        4. Select Virginia with selectByVisibleText()
        Thread.sleep(3000);
        stateDropdown.selectByVisibleText("Virginia");


//        5. Select California with selectByIndex()
        Thread.sleep(3000);
        stateDropdown.selectByIndex(5);


//        6. Verify final selected option is California.
//        Use all Select options. (visible text, value, index)
        // getFirstSelectedOption() method will return to current selected option
        String actualStateOption = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateOption = "California";

        Assert.assertEquals(actualStateOption,expectedStateOption,"Selected option verification is failed!");

        //Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "California","Selected option verification is failed!");

    }
}

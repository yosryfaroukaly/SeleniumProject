package com.cydeo.test.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    // Creating a private constructor, we are closing access to the
    // object of this class from outside the class
    private Driver() {
    }

    // We make WebDriver private, because we want to close access from outside of class
    // We make it static, because we will use it inside static method
    private static WebDriver driver;


    public static WebDriver getDriver() {

       // it will check if driver is null and if it is we will set up browser inside if statiement
        // if you already setup driver and using it again for following line of codes, it will return to same driver
        if (driver == null) {


        }

        return driver;


    }
}
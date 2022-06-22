package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Guru99_DragandDrop_Test {

    @Test
    public void guru99_dragAndDrop_test(){

        //    1- Open a chrome browser
//    2- Go to: https://demo.guru99.com/test/drag_drop.html
        Driver.getDriver().get(ConfigurationReader.getProperty("guru99.dropdown.url"));

//    3- Drag “BANK” and drop into Account area under Debit Side
        WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
        WebElement debitAccount = Driver.getDriver().findElement(By.id("bank"));

//    4- Drag “5000” and drop into Amount area under Debit Side


//    5- Drag “SALES” and drop into Account area under Credit Side


//    6- Drag “5000” and drop into Amount area under Credit Side


//    7- Verify “Perfect!” text displayed.
    }
}

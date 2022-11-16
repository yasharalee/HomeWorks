package com.nextbase.test.tests.cydeo_practice.Tables;

import com.nextbase.test.utilities.ConfigReader;
import com.nextbase.test.utilities.Driver;
import com.nextbase.test.utilities.Navigate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CydeoPracticeTable {
    @Test
    public void tableTask(){
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("practiceCydeoEnv"));
        WebElement bob = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String bobActual = bob.getText();
        String bobExpected = "Bob Martin";
        Assert.assertEquals(bobActual,bobExpected);

//        String  actualOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']//following-sibling::td[3]")).getText();
//        String ExpextedDate = "12/31/2021";
//        assertEquals(actualOrderDate, ExpextedDate);


        WebTableUtils.orderVerify("Bob Martin", "12/31/2021");


        Driver.closeDriver();

    }


}

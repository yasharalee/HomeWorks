package com.nextbase.test.tests.cydeo_practice.Tables;

import com.nextbase.test.utilities.ConfigReader;
import com.nextbase.test.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GetEmailFromTable {

    @Test
    public void getEmail(){
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("practiceTables"));
        WebTableUtils.getTableGetEmail("2", "Bach");

    }


    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

}

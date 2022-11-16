package com.nextbase.test.tests.smart_bear;

import com.nextbase.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login {
    public static void with(String userName, String password){
        WebDriver driver = Driver.getDriver();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password + Keys.ENTER);

    }
}

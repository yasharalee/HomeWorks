package com.nextbase.test.tests.second_driver_practice;

import com.nextbase.test.utilities.Browsers;
import com.nextbase.test.utilities.SecDriverTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EnumDriverSetPractice {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        SecDriverTest.setDriver(Browsers.CHROME);
        driver = SecDriverTest.getDriver();
    }

    @Test
    public void testEnum() {
        driver.get("https://www.google.com/");
    }
}

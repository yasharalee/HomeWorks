package com.nextbase.test.tests;

import com.nextbase.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.nextbase.test.utilities.Utils.*;


public class JavaScriptPractice {
    WebDriver driver = Driver.getDriver();
    @Test
    public void testTemp() {

        driver.get("https://www.google.com/");
        WebElement el = driver.findElement(By.name("q"));

        blinkBorder(el);
       // blinkBg(el, "#7EE1FC");
    }

    @Test
    public void testBackgroundHL() {
        driver.get("https://www.google.com/");
        WebElement signin = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a"));
        WebElement gmail = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
        highLightBg(gmail);
       // highLightBg(signin);
    }
}

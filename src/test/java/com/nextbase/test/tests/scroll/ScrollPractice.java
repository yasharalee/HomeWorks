package com.nextbase.test.tests.scroll;

import com.nextbase.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.nextbase.test.utilities.Utils.*;

public class ScrollPractice {

    WebDriver driver = Driver.getDriver();

    @Test
    public void testScroll() {
        driver.get("https://practice.cydeo.com/large");
        WebElement cydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true);", cydeo);
        sleep(2);
        // js.executeScript("window.scrollBy(0,-3000) ;");

        WebElement home = driver.findElement(By.xpath("//a[.='Home']"));

        sleep(2);

        js.executeScript("arguments[0].scrollIntoView(true)", home);
        sleep(2);
        Actions act = new Actions(driver);
        act.moveToElement(cydeo).perform();


    }
}

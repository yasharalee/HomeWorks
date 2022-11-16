package com.nextbase.test.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Utils implements utilsInterface {
    private Utils() {
    }

    private static WebDriver driver = Driver.getDriver();
    private static JavascriptExecutor js = (JavascriptExecutor) driver;

    public static void verifyTitle(String expected) {
        Assert.assertEquals(driver.getTitle(), expected);
    }


    public static void drawBorder(WebElement el) {
        js.executeScript("arguments[0].style.border = '3px solid red'", el);
    }

    public static void blinkBorder(WebElement el) {
        String borderColor = el.getCssValue("borderColor");
        for (int i = 0; i < 3; i++) {
            js.executeScript("arguments[0].style.border = '4px solid red'", el);
            //Another Syntax is below
            //((JavascriptExecutor) driver).executeScript("arguments[0].style.border = '4px solid red'",el);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            js.executeScript("Function.arguments[0].style.border = '4px solid #FFFFFF '", el);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void blinkBg(WebElement el, String color) {
        String bgColor = el.getCssValue("backgroundColor");
        for (int i = 0; i < 10; i++) {
            colorChange(color, el);
            colorChange(bgColor, el);
        }
    }

    public static void blinkBg(WebElement el, String color, int t) {
        String bgColor = el.getCssValue("backgroundColor");
        for (int i = 0; i < t; i++) {
            colorChange(color, el);
            colorChange(bgColor, el);
        }
    }

    public static void colorChange(String color, WebElement el) {
        js.executeScript("arguments[0].style.backgroundColor ='" + color + "'", el);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void highLightBg(WebElement el) {
        js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow; color:black;'" + ")", el);
    }

    public static void sleep(int n) {

        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}

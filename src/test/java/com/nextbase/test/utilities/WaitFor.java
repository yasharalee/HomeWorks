package com.nextbase.test.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor {

    private WaitFor(){}

    private static final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public static void visibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

        public static void invisibilityOf(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

            public static void clickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

            public static void alertDisplayed(){
        wait.until(ExpectedConditions.alertIsPresent());
    }

}

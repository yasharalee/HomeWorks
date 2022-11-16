package com.nextbase.test.tests.googleSearch;

import com.nextbase.test.utilities.ConfigReader;
import com.nextbase.test.utilities.Driver;
import com.nextbase.test.utilities.Navigate;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;



public class GoogleSideMenu {
    @Test
    public void testSideMenu() throws InterruptedException {
        Navigate.to(ConfigReader.getProperty("googleEnv"));
        Driver.getDriver().findElement(By.xpath("//a[@aria-label='Google apps']")).click();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().frame(1);
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//span[.='Duo']")).click();
        Thread.sleep(3000);


    }
    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}

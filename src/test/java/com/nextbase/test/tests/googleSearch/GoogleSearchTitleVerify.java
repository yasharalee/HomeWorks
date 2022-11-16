package com.nextbase.test.tests.googleSearch;

import com.nextbase.test.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.nextbase.test.utilities.NameGenerator.generate;

public class GoogleSearchTitleVerify {

    @DataProvider(name = "googleSearch")
    public static Object[][] googleSearchKeywords() {
        return generate(5);
    }

    @Test (dataProvider = "googleSearch")
    public void testGoogleTitleVerify(String[] keyword) throws InterruptedException {
        Navigate.to(ConfigReader.getProperty("googleEnv"));
        Driver.getDriver().findElement(By.name("q")).sendKeys(keyword[0] + Keys.ENTER);
        Utils.verifyTitle(keyword[0] + " - Google Search");
        Driver.getDriver().findElement(By.xpath("(//div[@class='hdtb-mitem']//*[.='Images'])")).click();
    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}

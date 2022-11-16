package com.nextbase.test.tests.smart_bear;

import com.github.javafaker.Faker;
import com.nextbase.test.utilities.ConfigReader;
import com.nextbase.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.AssertJUnit.assertEquals;

public class SmartBearTest {
    WebDriver driver = Driver.getDriver();
    @Test (priority = 1)
    public void testSmartBear() {

        driver.get(ConfigReader.getProperty("smartBearLogin"));
        Login.with("Tester", "test");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        List<String> texes = links.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println( "Number of links: " + texes.size());
        System.out.println( "Link texts: " + texes);

    }

    @Test  (priority = 2)
    public void testOrderTest() {
        driver.findElement(By.xpath("//a[.='Order']")).click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
        Select select = new Select(dropdown);
        select.selectByValue("FamilyAlbum");
        WebElement q = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        q.click();
        q.clear();
        q.sendKeys("2");
        driver.findElement(By.xpath("//input[@value = 'Calculate']")).click();
        Faker faker = new Faker();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(faker.name().fullName());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(faker.address().streetAddress());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(faker.address().city());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(faker.address().state());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(faker.address().zipCode().replace("-",""));
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(faker.finance().creditCard().replace("-",""));
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/29");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        String mess = driver.findElement(By.tagName("strong")).getText();
        String expected = "New order has been successfully added.";

        assertEquals(mess, expected);



    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}

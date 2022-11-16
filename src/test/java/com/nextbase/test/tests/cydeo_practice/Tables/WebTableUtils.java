package com.nextbase.test.tests.cydeo_practice.Tables;

import com.nextbase.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class WebTableUtils {
    /*
    This method should accept a costumerName and return the costumer order date
    as a String.
     */

    public static String returnOrderDate(String costumerName) {
        return  Driver.getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='"+ costumerName +"']//following-sibling::td[3]")).getText();

    }

    /*
    This method should accept above mentioned arguments and internally assert
    expectedOrderDate matching actualOrderDate.
     */

    public static void orderVerify(String costumerName, String expectedOrderDate) {
        assertEquals(returnOrderDate(costumerName), expectedOrderDate);

    }

    /*
        getTableGetEmail() method receives table number and persons name
        then prints persons Email (in that table) to console
     */

    public static void getTableGetEmail(String tableNum, String firstName){
        WebDriver driver = Driver.getDriver();

        String email = driver.findElement(By.xpath("(//table)[" + tableNum + "]//td[.='" + firstName + "']//following-sibling::td[2]") ).getText();

        System.out.println("Email for "+ firstName + " is:  " +  email);


    }

}

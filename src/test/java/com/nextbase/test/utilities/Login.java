
package com.nextbase.test.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Login{

    public static void with(String username, String password){
        Driver.getDriver().get(ConfigReader.getProperty("envNextBase"));
        Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(username);
        Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(password + Keys.ENTER);
    }

}

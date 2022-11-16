package com.nextbase.test.utilities;

import org.openqa.selenium.WebDriver;

public class Navigate{
    public static void to(String url){
        Driver.getDriver().get(url);
    }
}

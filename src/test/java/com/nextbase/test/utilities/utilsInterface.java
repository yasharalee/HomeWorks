package com.nextbase.test.utilities;

import org.openqa.selenium.WebElement;

public interface utilsInterface {

    static void  verifyTitle(String expected){};

    static void blinkBorder(WebElement el){};

    static void blinkBg(WebElement el, String color){};

    static void blinkBg(WebElement el, String color, int t){};

    static void colorChange(String color, WebElement el){};

    static void highLightBg(WebElement el){};

    static void sleep(int n){};


}

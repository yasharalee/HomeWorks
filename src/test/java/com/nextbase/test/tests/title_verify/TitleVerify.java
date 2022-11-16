package com.nextbase.test.tests.title_verify;


import com.nextbase.test.utilities.ConfigReader;
import com.nextbase.test.utilities.Driver;
import com.nextbase.test.utilities.Login;
import com.nextbase.test.utilities.Utils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TitleVerify  {

    @DataProvider(name = "credentials")
    public static Object[][] credential() {
        return new Object[][]{
                {"helpdesk1@cybertekschool.com", "UserUser"},
                { "Helpdesk2@cybertekschool.com", "UserUser" }
        };
    }

    @Test (dataProvider = "credentials")
    public void testTitleVerify(String[] cred) {
        Login.with(cred[0], cred[1]);
        Utils.verifyTitle(ConfigReader.getProperty("expectedPortalTitle"));
        Driver.closeDriver();
    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

}

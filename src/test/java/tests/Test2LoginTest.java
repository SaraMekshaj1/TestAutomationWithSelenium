package tests;

import base.BasePage;
import baseTestpack.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        homePage.goToSignLoginPage();
        signupLoginPage.logIntoApplication("saraMedkshjaj1869@gmail.com","1234567");
        String actualLoginStatus= homePage.getLoginInAsText();
        Assert.assertEquals(actualLoginStatus,"Logged in as Sara", "Unfortunately you are not successfully logged in");

        Assert.assertTrue(homePage.isDeleteButtonVisible());





    }

}

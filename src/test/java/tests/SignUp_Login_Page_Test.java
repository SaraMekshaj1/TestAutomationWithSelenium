package tests;

import baseTestpack.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUp_Login_Page_Test extends BaseTest {

    @Test
    public void testSignUp_Login_menu_Button(){
        homePage.goToLoginPage();
        String expectedPageTitle="New User Signup!";
        Assert.assertEquals(expectedPageTitle,signupLoginPage.getPageTitle(), "You have not navigated into Singup_Login_page  ");
    }
    @Test
    public void testSignUpButton(){
        homePage.goToLoginPage();
        signupLoginPage.setNameAtSingUp("Sara");
        signupLoginPage.setEmailAtSingUp("sara2059@gmial.com");
        signupLoginPage.clickSignUpButton();
        String actual= accountInformationPage.getPageTitle();
        Assert.assertEquals(actual,"ENTER ACCOUNT INFORMATION");
    }

    @Test
    public void testAccountInformationPage(){

    }

}

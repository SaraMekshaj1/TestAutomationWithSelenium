package tests;

import baseTestpack.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class Test3DashboardTest extends BaseTest {

    @Test
    public void dashboardTest(){

        var productPage=homePage.goToProductsPage();

        productPage.hoverOverblueTopProduct();
        productPage.hoverOverStylishDress();
        productPage.hoverOverSlievelessDress();


        productPage.clickAddToCardStylishDress();
        String actualText=productPage.getModalPopupText();
        String expectedAlertText="Added!";

        Assert.assertEquals(actualText,expectedAlertText);
        productPage.clickContinueButton();


        productPage.clickAddToCardSleevelessDress();
        String actualTextp2=productPage.getModalPopupText();

        Assert.assertEquals(actualTextp2,expectedAlertText);
        productPage.clickContinueButton();


    }



}

package tests;

import baseTestpack.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

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

       var cardPage= homePage.goToCartPage();

       Assert.assertTrue(cardPage.isStylishDressItemDisplayed(),"Stylish Dress Item is not visible in cart");
       Assert.assertTrue(cardPage.isSleevelessDressItemDisplayed(),"SleevelessDress Item is not visible in cart");




    }



}

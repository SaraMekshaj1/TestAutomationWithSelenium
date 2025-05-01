package tests;

import baseTestpack.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountInformationTestPage extends BaseTest {

    @Test
    public void testFillAccountInformation() {
        var accountInformationPage = homePage.goToLoginPage().signInIntoApplication("sara", "saramekshaj19@gmail.com");
        accountInformationPage.clicktitleMsrRadioButton();
        accountInformationPage.setName("Sara");
        accountInformationPage.setPassword("1234567");
        accountInformationPage.selectDayDropDown("14");
        accountInformationPage.selectYearDropDown("2001");
        accountInformationPage.selectMonthDropDown(3);
        accountInformationPage.clickNewsletterCheckBox();
        accountInformationPage.clickreceiveSpecialOffersCheckbox();
        accountInformationPage.setFirstName("Sara");
        accountInformationPage.setLast_name("Malaj");
        accountInformationPage.setCompanyName("Solution One");
        accountInformationPage.setAddress1("S John St");
        accountInformationPage.setAddress2Field("Apt 4B, Building 5");
        accountInformationPage.selectCountryDropDown("United States");
        accountInformationPage.setState("Indiana");
        accountInformationPage.setCity("Frankton");
        accountInformationPage.setZipCode("46044");
        accountInformationPage.setMobileNr("(765) 555-4324");
        accountInformationPage.clickCreateAccountButton();
        boolean isMscRadioButtonSelected = accountInformationPage.isMrsRadioButtonSelected();
        Assert.assertTrue(isMscRadioButtonSelected, "Msc radio button should be selected");
        boolean isNewsLetterSelected = accountInformationPage.isNewsLetterCheckBoxSelected();
        Assert.assertTrue(isNewsLetterSelected, "Newsletter is not selected");
        boolean isReceiveSelected = accountInformationPage.isReceiveSpecialOffersCheckboxSelected();
        Assert.assertTrue(isReceiveSelected, "Receive Special Offers is selected");


    }


}



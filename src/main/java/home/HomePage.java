package home;

import base.BasePage;
import org.openqa.selenium.By;
import pages.Signup_LoginPage;

public class HomePage extends BasePage {

    private By loginSigninHomeButton = By.xpath("//a[@href='/login']");
    private By logedAsNAME=By.xpath("//a[contains(., 'Logged in as') and .//b[text()='Sara']]");
    private By deleteAccountButton=By.xpath("//a[@href='/delete_account']");

    public Signup_LoginPage goToSignLoginPage() {
        click(loginSigninHomeButton);
        return new Signup_LoginPage();
    }

    public String getLoginInAsText(){
        return find(logedAsNAME).getText();
    }

    public boolean isDeleteButtonVisible(){
        return find(deleteAccountButton).isDisplayed();
    }

}

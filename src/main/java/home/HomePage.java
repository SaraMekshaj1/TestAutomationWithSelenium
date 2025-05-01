package home;

import base.BasePage;
import org.openqa.selenium.By;
import pages.Signup_LoginPage;

public class HomePage extends BasePage {

    private By loginHomeButton = By.xpath("//a[@href='/login']");
   

    public Signup_LoginPage goToLoginPage() {
        click(loginHomeButton);
        return new Signup_LoginPage();
    }

}

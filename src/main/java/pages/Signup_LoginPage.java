package pages;

import base.BasePage;
import home.HomePage;
import org.openqa.selenium.By;

public class Signup_LoginPage  extends BasePage {
    private By titlePage= By.xpath("//h2[text()='Login to your account']");
    private By emailLoginField=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    private By passwordLoginFiled=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    private By nameSignUpField=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private By emailSignUpField=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private By signUpButon=By.xpath(  "//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    private By loginButton=By.xpath("//button [@data-qa='login-button']");

    public String getPageSignupLoginTitle(){
        return find(titlePage).getText();
    }

  public void setNameAtSingUp(String name) {
      set(nameSignUpField, name);
  }
    public void setEmailAtSingUp(String email){
        set(emailSignUpField,email);
    }
    public AccountInformationPage clickSignUpButton(){
        click(signUpButon);
        return new AccountInformationPage();
    }
    public AccountInformationPage signInIntoApplication(String name, String email){
        setNameAtSingUp(name);
        setEmailAtSingUp(email);
        return clickSignUpButton();
    }

    public HomePage logIntoApplication(String email,String password){
        set(emailLoginField,email);
        set(passwordLoginFiled,password);
        click(loginButton);
        return new HomePage();
    }



}

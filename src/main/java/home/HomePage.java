package home;

import base.BasePage;
import org.openqa.selenium.By;
import pages.CartPage;
import pages.ProductsPage;
import pages.Signup_LoginPage;

public class HomePage extends BasePage {

    private By loginSigninHomeButton = By.xpath("//a[@href='/login']");
    private By logedAsNAME=By.xpath("//a[contains(., 'Logged in as') and .//b[text()='Sara']]");
    private By deleteAccountButton=By.xpath("//a[@href='/delete_account']");
    private By logoutButton=By.xpath("//a[@href='/logout']");
    private By productsNavBarButton=By.xpath("//a[@href='/products']");
    private By cartNavBarButton=By.xpath("//a[@href='/view_cart']");


    public ProductsPage goToProductsPage(){
        click(productsNavBarButton);;
        return new ProductsPage();
    }

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
    public Signup_LoginPage clickLogOut(){
        click(logoutButton);
        return new Signup_LoginPage();
    }
    public CartPage goToCartPage(){
        click(cartNavBarButton);
        return new CartPage();
    }
}

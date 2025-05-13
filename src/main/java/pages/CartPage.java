package pages;

import home.HomePage;
import org.openqa.selenium.By;

public class CartPage extends HomePage {

    private By sylishDressItem= By.id("product-4");
    private By slevelessDressItem=By.id("product-3");

    public boolean isStylishDressItemDisplayed() {
        return find(sylishDressItem).isDisplayed();
    }

    public boolean isSleevelessDressItemDisplayed() {
        return find(slevelessDressItem).isDisplayed();
    }


}

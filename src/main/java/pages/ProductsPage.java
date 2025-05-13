package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utilities.ActionsUtility.hoverOverElement;

public class ProductsPage extends BasePage {

   private By blueTopProduct=By.xpath("//div[@class='productinfo text-center']/p[text()='Blue Top']");
   private By stylishDress=By.xpath("//div[@class='productinfo text-center']/p[text()='Stylish Dress']");
   private By slivelessDress=By.xpath("//div[@class='productinfo text-center'][.//h2[text()='Rs. 1000'] and .//p[contains(text(),'Sleeveless')]]");

   private By addToCardStylishDress=By.xpath("//div[@class='productinfo text-center'][.//h2[text()='Rs. 1500'] and .//p[contains(text(),'Stylish Dress')]]//a[@data-product-id='4' and contains(@class, 'add-to-cart')]");
   private By addToCardSleevelessDress=By.xpath("//div[@class='productinfo text-center'][.//h2[text()='Rs. 1000'] and .//p[contains(text(),'Sleeveless')]]//a[@data-product-id='3' and contains(@class, 'add-to-cart')]");

   private By continueShoppingPopupButton=By.xpath("//button[@class='btn btn-success close-modal btn-block']");
    private By modalPopUpMessage=By.xpath("//div[@id='cartModal']//h4[contains(text(),'Added!')]");

   public void hoverOverblueTopProduct(){
       hoverOverElement(find(blueTopProduct));
   }
   public void hoverOverStylishDress(){
       hoverOverElement(find(stylishDress));
   }
   public void hoverOverSlievelessDress(){
       hoverOverElement(find(slivelessDress));
   }

    public void clickAddToCardStylishDress(){
        click(addToCardStylishDress);
    }

   public void clickAddToCardSleevelessDress(){
       click(addToCardSleevelessDress);

   }
    public String getModalPopupText(){
        waitUntilVisible(modalPopUpMessage,2);
        return find(modalPopUpMessage).getText();
    }
    public void clickContinueButton(){
        click(continueShoppingPopupButton);
    }





}

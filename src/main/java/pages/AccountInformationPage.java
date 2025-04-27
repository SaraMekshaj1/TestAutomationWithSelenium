package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class AccountInformationPage extends BasePage {
    private By titleName= By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b");

    public String getPageTitle(){
        return find(titleName).getText();
    }


}

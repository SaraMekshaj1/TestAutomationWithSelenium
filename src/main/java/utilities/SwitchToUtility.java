package utilities;
import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility {
/// this is used just for alerts , not modals

    private static WebDriver.TargetLocator switchTo(){
        return driver.switchTo();
    }
    public static String getAlertText(){
        return  switchTo().alert().getText();
    }
    public static void acceptAlert(){
        switchTo().alert().accept();
    }

}

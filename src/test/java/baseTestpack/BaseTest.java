package baseTestpack;

import base.BasePage;

import home.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import pages.AccountInformationPage;
import pages.Signup_LoginPage;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String url="https://automationexercise.com/";
    protected Signup_LoginPage signupLoginPage;
    protected AccountInformationPage accountInformationPage;
    //protected
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(url);
        basePage =new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage=new HomePage();
        signupLoginPage=new Signup_LoginPage();
        accountInformationPage=new AccountInformationPage();


    }
    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

}

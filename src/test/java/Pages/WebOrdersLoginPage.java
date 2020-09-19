package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonUtils;
import utilities.Driver;

public class WebOrdersLoginPage {

    WebDriver driver = Driver.getDriver(CommonUtils.getProperty("browser"));

    public WebOrdersLoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id ="ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id ="ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id ="ctl00_MainContent_status")
    public WebElement errorMessage;

    public void logIn(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();

    }
}

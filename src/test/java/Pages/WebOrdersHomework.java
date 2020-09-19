package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonUtils;
import utilities.Driver;

public class WebOrdersHomework {
    WebDriver driver = Driver.getDriver(CommonUtils.getProperty("browser"));

    public WebOrdersHomework(){

        PageFactory.initElements(driver,this);}

        @FindBy(id = "aspnetForm")
                public WebElement orderButton;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
    public WebElement customerNameBox;

    @FindBy(name ="ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement streetBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement cityBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement stateBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zipBox;

    @FindBy(name = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement VisacardBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement cardNumBox;

    public void logIn(String username,String password){


    }



}


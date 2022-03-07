package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelListPage {
    public HotelListPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagementButonu;


    @FindBy(xpath = "(//a[@href='/admin/HotelAdmin'])[1]")
    public WebElement hotelListButonu;


    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement ListOfHotelsButonu;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement ADDHOTELButonu;


    @FindBy(xpath = "//div[@class='caption']")
    public WebElement CreateHotelButonu;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement CreateHotelCodeButonu;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement CreateHotelNameButonu;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement CreateHotelAddressButonu;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement CreateHotelPhoneButonu;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement CreateHotelEmailButonu;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement CreateHotelIDGroupButonu;


    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement CreateHotelSaveButonu;
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // 1. yol  busekilde yorum satirlari ile belirtmek
    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement ilklogIn;

    // 2. yol  busekilde yorum satirlari ile belirtmek
    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement US010ilklogin;

    // 3. yol herkes icin gerekli olanlari 1. si ile
    // kararlastirdigimiz ozel locate icin 2. yol

    @FindBy(className = "username username-hide-on-mobile")
    public WebElement US010CreateAnAccountButonu;



    @FindBy(id = "UserName")
    public WebElement username;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "btnSubmit")
    public  WebElement submit;
    @FindBy(className = "username username-hide-on-mobile")
    public  WebElement manager;
    @FindBy(className = "icon-key")
    public WebElement logOut;
}

package pages;
import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class HotelMyCamp1 {
    public HotelMyCamp1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;
    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement usernameBox;
    @FindBy (xpath = "//input[@id='Password']")
    public WebElement paswordBox;
    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;
    @FindBy (xpath = "//span[text()='Try again please']")
    public WebElement girisYapilamadiYaziElementi;
    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;
    @FindBy(xpath = "//span[text()='Hotel Management']")
public WebElement hotelManagementLinki;
    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
public WebElement hotelListLinki;
    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;
    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeBlock;
   /*
    @FindBy ( xpath="//button[@id='btnSubmit']")
    public WebElement saveAddHotel;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement addHotelSaveSuccesWord;
*/



public void girisYap(){
    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    ilkLoginLinki.click();
    usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    paswordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    loginButonu.click();
}
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
   public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name="email")
    public WebElement emailKutusu;

    @FindBy(id="pass")
    public WebElement passWordKutusu;
    @FindBy(name="login")
    public WebElement loginButonu;
    @FindBy(className="_9ay7")
    public WebElement girilemediYazisi;
}

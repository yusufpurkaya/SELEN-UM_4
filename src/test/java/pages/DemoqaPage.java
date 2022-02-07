package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {
    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//div[@class='rt-tr']")
   public WebElement basliksatiriElementi;
/*    buradaki x path hatali
    @FindBy(xpath = "//div[@class='rt-tr']")
   public List<WebElement> basliklarWebelementleriListesi;
*/

@FindBy(xpath = "//div[@class='rt-tbody']")
public WebElement bodyTekWebelement;

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaP {
    public DemoqaP(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement baslikElemanlari;

@FindBy(xpath = "(//div[@class='rt-resizable-header-content'])[3]")
    public WebElement ucuncuBaslikElementi;
@FindBy (xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
public List<WebElement> baslikElementleriListesi;

@FindBy (xpath = "//div[@class='rt-td']")
    //public List<WebElement> tumBodyListesi;
public WebElement tumbodytekElement;
    @FindBy (xpath = "//div[@class='rt-td']")
    public List<WebElement> tumBodyListesi;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement bodyTekWebelement;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> satirlarListesi;

    public void kolonMethod(int kolon) {
        int satirSayisi=satirlarListesi.size();
        String dinamikxpath;
        WebElement yazdirmakicin;
        for (int i = 1; i <=satirSayisi ; i++) {
            dinamikxpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+kolon+"]";

            yazdirmakicin=Driver.getDriver().findElement(By.xpath(dinamikxpath));
            System.out.println(yazdirmakicin.getText());
        }

    }

    public void isimleYazdir(String isim) {
        int satirsayisi=satirlarListesi.size();
        String dinamikxpath;
String cierra;
String salary;
        for (int i = 1; i <=satirsayisi ; i++) {
            dinamikxpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])[1]";
      cierra=Driver.getDriver().findElement(By.xpath(dinamikxpath)).getText();
dinamikxpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])[5]";
salary=Driver.getDriver().findElement(By.xpath(dinamikxpath)).getText();
        if (cierra.equals(isim)){
            System.out.println(salary);      }
    }
}


    public void satirSutunYazdir(int satir,int sutun){
        String dinamikXpath="((//div[@class='rt-tr-group'])["+satir+"]//div[@class='rt-td'])["+sutun+"]";
        System.out.println(Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText());

    }
}
/* public void hucreYazdir(int satir, int sutun) {
        String dinamikXpath="((//div[@class='rt-tr-group'])["+satir+"]//div[@class='rt-td'])["+sutun+"]";
        System.out.println(Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText());

    }*/
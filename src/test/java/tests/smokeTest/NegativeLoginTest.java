package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp1;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et
    HotelMyCamp1 hotelMyCamp1;
    @Test
    public void yanlisSifreTest() {

        Driver.getDriver().get("HMCUrl");


      hotelMyCamp1 = new HotelMyCamp1();
        hotelMyCamp1.ilkLoginLinki.click();
        //                - yanlisSifre
        hotelMyCamp1.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCamp1.paswordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCamp1.loginButonu.click();
        Assert.assertTrue(hotelMyCamp1.girisYapilamadiYaziElementi.isDisplayed());
    }
     @Test
    public void yanlisKulllaniciTesti() {
         //                - yanlisKulllaniciAdi

         hotelMyCamp1.usernameBox.clear();
         hotelMyCamp1.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
         hotelMyCamp1.paswordBox.clear();
         hotelMyCamp1.paswordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
         Assert.assertTrue(hotelMyCamp1.girisYapilamadiYaziElementi.isDisplayed());

     }
     @Test
    public void yanlisSifreKullaniciTesti(){

         hotelMyCamp1.usernameBox.clear();
         hotelMyCamp1.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
         hotelMyCamp1.paswordBox.clear();
         hotelMyCamp1.paswordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
         Assert.assertTrue(hotelMyCamp1.girisYapilamadiYaziElementi.isDisplayed());

        //                - yanlisSifreKullanici
        //test data yanlis username: manager1 , yanlis password : manager1

        //2) https://www.hotelmycamp.com adresine git
        //3) Login butonuna bas
        //4) Verilen senaryolar ile giris yapilamadigini test et
    }

}

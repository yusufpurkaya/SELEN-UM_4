package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp1;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {

@Test
    public void test01(){
    //1) com.techproed altinda bir package olustur : smoketest
    //2) Bir Class olustur : PositiveTest

    //3) Bir test method olustur positiveLoginTest()

    //         https://www.hotelmycamp.com adresine git
    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    //        login butonuna bas
    HotelMyCamp1 hotelMyCamp1=new HotelMyCamp1();
    hotelMyCamp1.ilkLoginLinki.click();
    //test data username: manager ,
    hotelMyCamp1.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    //test data password : Manager1!
    hotelMyCamp1.paswordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    hotelMyCamp1.loginButonu.click();
    //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    Assert.assertTrue(hotelMyCamp1.basariliGirisYaziElementi.isDisplayed());
}


}

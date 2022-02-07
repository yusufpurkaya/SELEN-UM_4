package tests.day17;

import org.testng.annotations.Test;
import pages.HotelMyCamp1;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_Properties_ilkClass {
    @Test
    public void positiveLoginTesti(){
        // hotel my camp sitesine positive login testini POM a tam uygun olarak yapiniz

//https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
//        login butonuna bas

        HotelMyCamp1 hotelMyCamp1=new HotelMyCamp1();
                hotelMyCamp1.ilkLoginLinki.click();
        /*
//    test data username: manager ,
hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
//    test data password : Manager1!
hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
hotelMyCampPage.submit.click();
//    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
 */   }
}

package tests.day17;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCamp_NehativeLogin {
    //1 ) Bir Class olustur : NegativeTest
    //2) Bir test method olustur NegativeLoginTest()
    //         https://www. hotelmycamp.com/ adresine git
    //        login butonuna bas
    //    test data username: manager1 ,
    //    test data password : manager1!
    //    Degerleri girildiginde sayfaya girilemedigini test et

    @Test
    public void test01() throws InterruptedException {
        //         https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //        login butonuna bas
       Thread.sleep(4);
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilklogIn.click();
        //    test data username: manager1 ,
       hotelMyCampPage.username.sendKeys("manager1");
        //    test data password : manager1!
       hotelMyCampPage.password.sendKeys("manager1!");
        //    Degerleri girildiginde sayfaya girilemedigini test et


    }
}

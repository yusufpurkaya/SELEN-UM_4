package tests.day16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {

    @Test(groups = {"miniregration,smoke"})
    public void positiveLoginTesti() throws InterruptedException {
        //1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //        https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //        login butonuna bas
        Thread.sleep(3);
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilklogIn.click();

        //    test data username: manager ,
hotelMyCampPage.username.sendKeys("manager");
        //    test data password : Manager1!
hotelMyCampPage.password.sendKeys("Manager1!");
    //    Actions actions=new Actions(Driver.getDriver());
     //   actions.sendKeys(Keys.PAGE_DOWN).perform();

hotelMyCampPage.submit.click();

        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
Actions actions=new Actions(Driver.getDriver());
actions.moveToElement(hotelMyCampPage.manager).perform();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.logOut.isDisplayed());
        softAssert.assertAll();
    }

}

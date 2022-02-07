package tests.day17;

import org.testng.annotations.Test;
import pages.HotelMyCamp1;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_WrongKeyUsage {
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCamp1 hotelMyCamp1=new HotelMyCamp1();
        hotelMyCamp1.ilkLoginLinki.click();
        hotelMyCamp1.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

    }
}

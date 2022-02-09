package tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGReports extends TestBaseRapor {


    @Test
    public void windowHandleReusable() throws IOException {
        extentTest=extentReports.createTest("window handle","title ile ikinci sayfaya gecis yapılma testi");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
       extentTest.info("herokuapp sayfasina gidildi");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
       extentTest.info("yeni window linkine tiklandi");
        ReusableMethods.switchToWindow("New Window");
       extentTest.info("reusuable method ile ikinci sayfaya gecildi");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        System.out.println("actualTitle"+ actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("titlenin beklenen deger ile ayni oldugu test edildi");
       // ReusableMethods.getScreenshot("WindowSwitch");
       // Driver.closeDriver();   // son iki islemi zaten TstBaseRapor class i yapiyo
    }
}

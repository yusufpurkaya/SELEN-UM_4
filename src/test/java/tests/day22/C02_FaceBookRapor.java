package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_FaceBookRapor extends TestBaseRapor {
    @Test(groups = {"miniregration,regression"})
    public void test01(){
       extentTest=extentReports.createTest("facebook","fake isimle giris yapilamadi");
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");
       extentTest.info("facebook a gidildi");
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        FacebookPage facebookPage=new FacebookPage();
        Faker faker=new Faker();
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passWordKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();
        extentTest.info("ilgili alanlar faker ile dolduruldu");
        //4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.girilemediYazisi.isDisplayed());
        extentTest.pass("girilemedigi test edildi");
        ReusableMethods.waitFor(5);


    }
}

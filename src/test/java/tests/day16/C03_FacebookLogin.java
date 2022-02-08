package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {

@Test(groups = {"miniregration,regression"})
    public void test01(){
    //1 - https://www.facebook.com/ adresine gidin
    Driver.getDriver().get("https://www.facebook.com");
    //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    FacebookPage facebookPage=new FacebookPage();
    Faker faker=new Faker();
    //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

    facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
    facebookPage.passWordKutusu.sendKeys(faker.internet().password());
    facebookPage.loginButonu.click();
    //4- Basarili giris yapilamadigini test edin

    Assert.assertTrue(facebookPage.girilemediYazisi.isDisplayed());
    Driver.closeDriver();

}
}
package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02PageIlkClass {

// POM de farkli class lara farkli sekilde ulasilmasi benimsenmistir
    // Driver class icin static yontemi kullaniyoruz
    // Pages class lari icinse obje uzerinden kullanimi tercih edilmistir
    @Test(groups = {"miniregration,smoke"})
    public void test01(){
        // amazona gidelim

        Driver.getDriver().get("https://www.amazon.com");

        //aramakutusuna nutella yazip aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // arama sonuclarinin nutella icerdigini test edelim
        String actualSonucYazisi=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains("Nutella"));
        Driver.closeDriver();
    }
@Test
    public void test02(){
        // amazona git java arat ve sonuc da java icerip icermedigini test et
    Driver.getDriver().get("https://www.amazon.com");
    AmazonPage amazonPage=new AmazonPage();
    amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);
        String actuelJavaSonucu=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actuelJavaSonucu.contains("Java"));

        Driver.closeDriver();
}
}

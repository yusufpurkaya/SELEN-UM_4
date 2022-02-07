package tests.day16;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {
  // artik driver a ihtiyac varsa Driver.getDriver() yazacagiz

    @Test
    public void test01(){
        // amazona gidelim

        Driver.getDriver().get("https://www.amazon.com");
        //amazona gitdigimizi test edelim
        String actuelTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actuelTitle.contains("Amazon"));

        // Driver.getDriver method'u her calistiginda
        // driver= new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
        // Biz Driver class'dan getDriver'i ilk calistirdigimizda new atamasi olsun
        // sonraki calistirmalarda atama olmasin istiyoruz
        // bunun icin driver= new ChromeDriver(); satiri bir if blogu icine alacagiz
Driver.closeDriver();


    }
@Test
    public void test02(){
        // bestbuy a gidelim ve
        Driver.getDriver().get("https://www.bestbuy.com");
        //gittigimizi test edelim
        String currenturl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currenturl.contains("best"));
Driver.closeDriver();
    }



}

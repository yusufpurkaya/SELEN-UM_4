package tests.demoqa;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DemoqaP;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class C01 {
    //Bir Class olusturun D19_WebtablesHomework
  @Test
    public void test01(){

    //  1. “https://demoqa.com/webtables” sayfasina gidin
      Driver.getDriver().get(ConfigReader.getProperty("Demoqaurl"));
    //  2. Headers da bulunan department isimlerini yazdirin
      DemoqaP demoqaP=new DemoqaP();
      System.out.print(demoqaP.baslikElemanlari.getText());

    //  3. 3. sutunun basligini yazdirin
    System.out.println(demoqaP.ucuncuBaslikElementi.getText());
    System.out.println(demoqaP.baslikElementleriListesi.get(2).getText());
    //  4. Tablodaki tum datalari yazdirin

    System.out.println(demoqaP.bodyTekWebelement.getText());
      System.out.println(demoqaP.tumBodyListesi);
List<WebElement> bizimlist=demoqaP.tumBodyListesi;
   System.out.println("bizim deneme size  : "+bizimlist.size());

    //  5. Tabloda kac cell (data) oldugunu yazdirin

    //  6. Tablodaki satir sayisini yazdirin
List<WebElement> satirlaList=demoqaP.satirlarListesi;
     System.out.println("satir sayisi : "+satirlaList.size());

      //  7. Tablodaki sutun sayisini yazdirin
      System.out.println("sutun sayisi :"+(demoqaP.tumBodyListesi.size()/demoqaP.satirlarListesi.size()));
    //  8. Tablodaki 3.kolonu yazdirin
     System.out.println("============");
demoqaP.kolonMethod(2);
    //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
demoqaP.isimleYazdir("Cierra");
    // 10. Page sayfasinda bir method olusturun,
      //     Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
demoqaP.satirSutunYazdir(2,3);
}
}
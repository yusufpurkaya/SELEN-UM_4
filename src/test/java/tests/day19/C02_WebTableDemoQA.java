package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoQA {
    //Bir Class olusturun D19_WebtablesHomework
    //  1. “https://demoqa.com/webtables” sayfasina gidin
    //  2. Headers da bulunan department isimlerini yazdirin
    //  3. sutunun basligini yazdirin
    //  4. Tablodaki tum datalari yazdirin
    //  5. Tabloda kac cell (data) oldugunu yazdirin
    //  6. Tablodaki satir sayisini yazdirin
    //  7. Tablodaki sutun sayisini yazdirin
    //  8. Tablodaki 3.kolonu yazdirin
    //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
    // 10. Page sayfasinda bir method olusturun,
    //     Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

    @Test
    public void demoqaTest(){
        //  1. “https://demoqa.com/webtables” sayfasina gidin


        //  2. Headers da bulunan department isimlerini yazdirin
       //thead//th veya //tr dir normalde ancak bu sitede class isimleri ile organize edilmis

// diger bir secenekler de bu elementleri list e atardik boylece herbir basliga ulasma imkani verirdi
//   demoqaPage.basliklarWebelementleriListesi;  page de olusturduk



        //  3. sutunun basligini yazdirin
       // System.out.println("3. sutun basligi : "+demoqaPage.basliklarWebelementleriListesi.get(2).getText());
       //page deki x path in hatali


        //  4. Tablodaki tum datalari yazdirin

        //  5. Tabloda kac cell (data) oldugunu yazdirin


        //  6. Tablodaki satir sayisini yazdirin
// farkli yollardan hesaplanabilir ama hucresayisi/sutun sayisi  ndan yapabiliriz.



        //  7. Tablodaki sutun sayisini yazdirin

        //  8. Tablodaki 3.kolonu yazdirin
        //        ((//div[@class='rt-tr-group'])[3]//div[@class='rt-td'])[2]

        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
// bi method daha olusturup yapabiliriz method parametre olarak isim gonderip salary i yazdirabiliriz



        // 10. Page sayfasinda bir method olusturun,
        //     Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin


    }

}

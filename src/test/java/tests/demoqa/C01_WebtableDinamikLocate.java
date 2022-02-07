package tests.demoqa;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HMCWebTablePageT;
import pages.HotelMyCampPage;
import pages.HotelMyCampPageT;
import utilities.Driver;

public class C01_WebtableDinamikLocate {
    // 3 test method'u olusturalim




    HMCWebTablePageT hmcWebTablePage;
    HotelMyCampPageT hotelMyCampPage;
    @Test
    public void satirYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPageT();
        hotelMyCampPage.girisYap();
      // 1.method satir numarasi verdigimde bana o satirdaki datalari yazdirsin

        // 2.satiri yazdir  //tbody//tr[2]
        // 7.satiri yazdir //tbody//tr[7]

        hmcWebTablePage=new HMCWebTablePageT();
        WebElement ucuncusatirElementi=hmcWebTablePage.satirGetir(4);

        System.out.println(ucuncusatirElementi.getText());

        Driver.closeDriver();
    }

    @Test
    public void hucreGetirTesti(){
        hotelMyCampPage=new HotelMyCampPageT();
        hotelMyCampPage.girisYap();
        // 2. method satir no ve data numarasi girdigimde verdigim datayi yazdirsin
        hmcWebTablePage=new HMCWebTablePageT();

        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        System.out.println("girdiginiz hucredki element : "+hmcWebTablePage.hucreWebelementGetir(5,3));
        Driver.closeDriver();
    }

    @Test
    public void sutunYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPageT();
        hotelMyCampPage.girisYap();
        // 3. sutun numarasi verdigimde bana tum sutunu yazdirsin
        hmcWebTablePage=new HMCWebTablePageT();
        hmcWebTablePage.sutunYazdir(4);

        Driver.closeDriver();
    }
}

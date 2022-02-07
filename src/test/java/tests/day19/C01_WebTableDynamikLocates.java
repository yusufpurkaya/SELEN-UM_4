package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCamp1;

public class C01_WebTableDynamikLocates {
    // 3 test methodu olusturalim
    //1.method satir numarasi verdigimde bana o satirdaki datalari yazdirsin
    // 2. method satir no ve data numarasi girdigimde , verdigim datayi yazdirsin
    //3.method sutun numarasi verdigimde bana tum sutunu yazdirsin

    HMCWebTablePage hmcWebTablePage;
    HotelMyCamp1 hotelMyCamp1;
    @Test
public void satirYazdirTesti(){
    //1.method satir numarasi verdigimde bana o satirdaki datalari yazdirsin
    //       //tbody//tr[2]  -> 2.satirin konumu
hotelMyCamp1=new HotelMyCamp1();
hotelMyCamp1.girisYap();
   hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncusatirElemnti=hmcWebTablePage.satirYazdir(3);
        System.out.println(ucuncusatirElemnti.getText());
}

@Test
    public void hucreGetirTesti(){
    // 2. method satir no ve data numarasi girdigimde , verdigim datayi yazdirsin
    hotelMyCamp1=new HotelMyCamp1();
    hotelMyCamp1.girisYap();
    hmcWebTablePage=new HMCWebTablePage();
    //   //tbody//tr[2]//td[4]  -> 2. satir 4. datasi

   // 3. satir 5 . sutun/datayi getirin

    System.out.println("girdiginiz hucredeki element :"+hmcWebTablePage.hucreWebElementGetir(3,5));



}
@Test
    public void sutunYazdir(){
    //3.method sutun numarasi verdigimde bana tum sutunu yazdirsin
    //tbody//tr[i]td[x]
    //tbody//tr[i+1]td[x]
    //tbody//tr[i+2]td[x]
    //tbody//tr[i+3]td[x]

    hotelMyCamp1=new HotelMyCamp1();
    hotelMyCamp1.girisYap();
    hmcWebTablePage=new HMCWebTablePage();
    hmcWebTablePage.sutunYazdir(4);


    }
}

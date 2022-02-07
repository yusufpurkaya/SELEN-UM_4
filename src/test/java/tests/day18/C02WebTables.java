package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCamp1;
import utilities.Driver;

import java.util.List;

public class C02WebTables {
   HotelMyCamp1 hotelMyCamp1;
    HMCWebTablePage hmcWebTablePage;
    @Test
    public void loginTest() {
        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //            ○ Username : manager
        //            ○ Password : Manager1!
     hotelMyCamp1=new HotelMyCamp1();
        hotelMyCamp1.girisYap();
    }


    @Test
    public void table(){

        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.

        // header kisminda birinci satir ve altindaki datalari locate edelim
        //     //thead//tr[1]//td
        hmcWebTablePage=new HMCWebTablePage();
        List<WebElement> headerDataList=hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("tablo 1. sutun sayisi"+headerDataList.size());

        /*
        // Eger body'yi tek bir webelement olarak locate edersek
        // icindeki tum datalari getText() ile yazdirabiliriz
        // ancak bu durumda bu elementler ayri ayri degil,
        // body'nin icindeki tek bir String'in parcalari olurlar
        // dolayisiyla bu elementlere tek tek ulasmamiz mumkun olmaz
        // sadece contains method'u ile body'de olup olmadiklarini test edebiliriz.

        // eger her bir datayi ayri ayri almak istersek
        //  //tbody//td seklinde locate edip bir list'e atabiliriz
         */


        // bu bize butun body yi getiriri ama tek bir obje olarak getiririr
        // ve sadece contains metoduyla body de olup olmadigini test edebiliriz
        System.out.println(hmcWebTablePage.tumBodyWebElement.getText());

        // eger her bir datayi ayri ayri almak istersek "//tbody//td" seklinde locate ederiz ve
        List<WebElement> bodyDataListesi=hmcWebTablePage.bodyTumDataList;
        System.out.println(hmcWebTablePage.bodyTumDataList.size());

    }
@Test(dependsOnMethods ="loginTest")
    public void printRows(){
        //● printRows( ) metodu oluşturun //tr
        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
//   //tbody//tr
    hmcWebTablePage=new HMCWebTablePage();
        System.out.println("body deki tum data sayisi"+hmcWebTablePage.bodyTumDatalari.size());
        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
    List <WebElement> satirlarWebelementListesi=hmcWebTablePage.bodyTumDatalari;
    for (WebElement each: satirlarWebelementListesi
    ) {
        System.out.println(each.getText());
    }
     // lambdayla  hmcWebTablePage.bodyTumDatalari.stream().forEach(t-> System.out.println(t.getText()));



        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
    System.out.println("4.satir : "+satirlarWebelementListesi.get(3).getText());
/*
  @Test (dependsOnMethods = "loginT")
    public void printRows(){
        //● printRows( ) metodu oluşturun //tr
        //          ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        // //tbody//tr
        hmcWebTablePage=new HMCWebTablePage();
        System.out.println(hmcWebTablePage.satirlarListesi.size());
        //          ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        List <WebElement> satirlarWebelementListesi=hmcWebTablePage.satirlarListesi;
        for (WebElement each: satirlarWebelementListesi
             ) {
            System.out.println(each.getText());
        }
        //          ○ 4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println("4.satir : "+satirlarWebelementListesi.get(3).getText());
 */


    }


}

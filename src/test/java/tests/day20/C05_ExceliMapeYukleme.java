package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_ExceliMapeYukleme {
@Test
    public void test01(){
        // dosya yolu ve sayfa ismi verilen bir excel sheet in
        //map olarak reusuable bir method olusturalim
        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";
     ReusuableMethodsExcel.mapCreate(path,sayfaAdi);
        System.out.println(ReusuableMethodsExcel.mapCreate(path,sayfaAdi));

        // olusturdugumuz map i kullanarak ulke ismi Turkey in bilgilerini yazdiriniz


    Map<String,String> ulkelerMap= ReusuableMethodsExcel.mapCreate(path,sayfaAdi);
    System.out.println(ulkelerMap.get("Turkey"));
    // listede Netherlands oldugunu test edin
    Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));

    }
}

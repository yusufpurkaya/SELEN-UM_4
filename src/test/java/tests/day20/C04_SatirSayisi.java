package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {

@Test
    public void test01() throws IOException {
    // ulkeler excel indeki sayfa1 ve Sayfa2 deki satir sayisini
    // ve kullanilan satir sayilarini
    String path="src/test/java/resources/ulkeler.xlsx";
    FileInputStream fis=new FileInputStream(path);
    Workbook workbook= WorkbookFactory.create(fis);
    int sayfa1SatirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
    int sayfa1fizikiKullanilanSatirSayisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
    System.out.println("1. sayfa satir sayisi"+sayfa1SatirSayisi);
    // 190 cunku index olarak dondurdu
    System.out.println("1. sayfa fiziki satir sayisi "+sayfa1fizikiKullanilanSatirSayisi);
   // 191 cunku fiziki kullanilan sayma sayisiyla dondu
    int sayfa2SatirSayisi=workbook.getSheet("Sayfa2").getLastRowNum();
    int sayfa2fizikiKullanilanSatirSayisi=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();
    System.out.println("2. sayfa satir sayisi"+sayfa2SatirSayisi);
    // bos satir varsa onlarida  aliyor  14
    System.out.println("2. sayfa fiziki satir sayisi "+sayfa2fizikiKullanilanSatirSayisi);
    // bos satirlari almiyor  6
}

}

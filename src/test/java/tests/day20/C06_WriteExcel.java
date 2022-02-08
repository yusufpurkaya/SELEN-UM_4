package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {
    @Test
    public void test01() throws IOException {
        // ulkeler excel ine 5.sutun olarak Nufus sutunu ekleyelim
        //3. satirdaki ulke nufusunu 10000000 yapalim

        // dosyaya ulaalim
        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);


       // class da calismak istedigim dosyanin bir kopyasi olan workbook olusturalim
        Workbook workbook= WorkbookFactory.create(fis);
// ilk satirin 5. hucresine nufus basligini yazdiralim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");
 //3. satirdaki ulke nufusunu 10000000 yapalim
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("10000000");
//4. kopyada yaptigimiz degisiklikleri ana dosyaya kaydedelim

        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);
    }
}

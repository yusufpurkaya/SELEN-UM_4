package tests.day20;
import org.apache.poi.ss.usermodel.*;
/*
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 */
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sayfa1");
        Row row=sheet.getRow(4);
        Cell cell=row.getCell(2);
// biz fileinputstream ile okudugumuz excel dosyasini projemiz icinde kullanbilmek icin
// apachi poi dependency yardimi ile bir workbook olusturduk
// bu workbook bizim projemiz icinde ulkeler excell inin bir kopyasini kullanmamizi sagliyor
// excell in yapisi geregi bir hucreye(cell) ulasabilmemiz icin workbook dan baslayarak
// sheet,row, ve cell objesi olusturmamiz gerekiyor
        System.out.println(cell);

        //indexi 4 olan satirdaki index i 2 olan hucrenin Andorra old test ediniz

        String expecteddata="Andorra";
        Assert.assertEquals(cell.toString(),expecteddata);
        // 5.index deki satirin 3. index deki datasini/hucre/cell ini yazdiriniz
        row=sheet.getRow(5);
        cell=row.getCell(3);
        System.out.println(cell);




    }
}

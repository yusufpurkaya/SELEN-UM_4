package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReusuableMethodsExcel {
    // bir method olusturalim
    // dosya yolu,sayfa ismi ve satir, hucre indexini verince hucre bilgisini dondursun

    public static Cell hucreGetir(String path, String sayfaIsmi,int satirIndex, int hucreIndex){
        Cell cell=null;
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            cell=workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(hucreIndex);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return cell;
    }


    public static Map<String, String> mapCreate(String path, String sayfaAdi) {
        Map<String,String> excelMap=new HashMap();
     //eger tree map yapsak o zaman mapimiz dogal sirali olurdu
        //   Map<String,String> excelMapT=new TreeMap<>();
      Workbook workbook=null;

      // ilk adim excell e ulasmak
      try {
            FileInputStream fis=new FileInputStream(path);
            workbook=WorkbookFactory.create(fis);


        } catch (IOException e) {
            e.printStackTrace();
        }
        int satirsayisi=workbook.getSheet(sayfaAdi).getLastRowNum();
      String key="";
      String value="";
        for (int i = 0; i <=satirsayisi ; i++) {

            //2. adim tablodaki hucreleri map e uygun hale donusturmek
            key=workbook.getSheet(sayfaAdi).getRow(i).getCell(0).toString();
            value=workbook.getSheet(sayfaAdi).getRow(i).getCell(1).toString()+" "+
                    workbook.getSheet(sayfaAdi).getRow(i).getCell(2).toString()+" "+
                    workbook.getSheet(sayfaAdi).getRow(i).getCell(3).toString();
            //3. aim key value haline getirdigimiz satirlari map e eklemek
            excelMap.put(key,value);
        }

      return excelMap;

    }
  /*  public static Map<String, String> mapNestedLoop(String path, String sayfaAdi) {
        Workbook workbook=null;
        Map<String,String> excelMap=new HashMap();
    int satirSayisi = workbook.getSheet(sayfaAdi).getLastRowNum();
        int sutunSayisi = workbook.getSheet(sayfaAdi).getRow(0).getLastCellNum();
        String key="";
        String value = "";

        //Nested for loop ile

        for (int i=0; i<satirSayisi; i++){
            //2.Step Tablo daki hucreleri map'e uygun hale donusturmek
            key=workbook.getSheet(sayfaAdi).getRow(i).getCell(0).toString();
            for(int j=0; i<sutunSayisi;i++) {
                value = workbook.getSheet(sayfaAdi).getRow(i).getCell(1).toString() + ", " +
                        workbook.getSheet(sayfaAdi).getRow(i).getCell(2).toString() + ", " +
                        workbook.getSheet(sayfaAdi).getRow(i).getCell(3).toString();
            }
            // 3.Step key-value haline getirdigimiz satirlari map'e eklemek
            excelMap.put(key,value);
        }
    } */

}

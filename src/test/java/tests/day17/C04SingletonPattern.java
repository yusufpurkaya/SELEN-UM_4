package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04SingletonPattern {
    @Test
    public void test01(){
        // singletonPattern bir class dan bir den fazla obje uretilmesine izin vermeyen bir pattern
        //olarak kabul edilir
        // biz Driver class ini driver uretmek uzere kullaniyoruz ancak driver class inda
        //driver isminde instance variable da var.
        //Biz obje ureterek instance veriable ye ulasabiliriz

    //    Driver driver=new Driver();
// amac bir class dan obje uertilmemesini saglamaktir
        //bunun icin koruyacagimiz class da parametresiz bir constructor olusturur ve bu constructor
        //i private yapariz

    }
}

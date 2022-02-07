package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCamp1;
import utilities.Driver;

public class E2ETesting {
    @Test
    public void createHotel(){
        //1. Tests packagenin altına class olusturun: CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://www.hotelmycamp.com adresine git.
        HotelMyCamp1 hotelMyCamp1=new HotelMyCamp1();
        hotelMyCamp1.girisYap();
        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
        //    a. Username : manager
        //    b. Password  : Manager1!
        //5. Login butonuna tıklayın.
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
      hotelMyCamp1.hotelManagementLinki.click();
      hotelMyCamp1.hotelListLinki.click();
      hotelMyCamp1.addHotelLinki.click();


        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

actions.click(hotelMyCamp1.addHotelCodeBlock).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).
        sendKeys(faker.name().name()).sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).
        sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
        .sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(faker.internet().emailAddress())
        .perform();
        //8. Save butonuna tıklayın.
        // dropbox var onu handle etmen lazim
        // belki javascript de olabilir
        // alert de olabilir


        //Select select=new Select(hotelMyCamp1.)


        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        //10. OK butonuna tıklayın.
    }
}

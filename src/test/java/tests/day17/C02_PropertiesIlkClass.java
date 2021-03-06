package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesIlkClass {

    @Test
    public void positiveLoginTesti(){
        //hotel my camp sitesine positive login testini POM a uygun olarak yaziniz
       // https://www. hotelmycamp.com/ adresine git
       // Driver.getDriver().get("buraya properties dosyasina git HMCUrl e karsilk gelen degeri getir");
Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
//        login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
//        test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
//           test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();
//     Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());


    }
}

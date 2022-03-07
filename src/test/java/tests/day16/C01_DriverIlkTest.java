package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {
    //driver class i sayesinde bizim eski driver class died
    //artik driver a ihtiyac varsa Driver.getDriver() yazicaz
    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("http://www.amazon.com");
        //amazona gittigimizi test edelim
        String actualTitle=Driver.getDriver().getTitle();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("Amazon"));

          //driver.getDriver methodu her calistiginda
        //driver=new ChromeDriver komutundan dolayi yeni bir driver olusturuyor
        //biz driver class indan getDriver i ilk calistirdigimizda new atamasi olsun
        //sonraki calistirmalarda. atama olmasin istiyoruz
        //bunun icin driver=new chromeDriver()  if kullanmaliyiz
    Driver.closeDriver();
    }
    @Test
    public void test02(){
        //best buy ana sayfaya gidelim
        Driver.getDriver().get("http://www.bestbuy.com");
        //best buy a gittigimizi test edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }
}

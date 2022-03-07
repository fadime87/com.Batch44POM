package tests.practice;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class hotelListLocate  {

    @Test
    public void test() {
        Driver.getDriver().get("https://www.hotelmycamp.com");


    }
}
package tests.day20;

import org.testng.annotations.Test;

public class C05_ExceliMapeYukleme {
    @Test
    public  void  test01(){


        String path = "src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        ReusableMethodsExcel.mapOlustur(path,sayfaAdi);
    }
}

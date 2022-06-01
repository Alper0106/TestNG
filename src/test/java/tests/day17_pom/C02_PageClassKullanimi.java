package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.Driver;

public class C02_PageClassKullanimi {

    @Test
    public void test01() {
        AmazonPages amazonPages=new AmazonPages();

        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //nutella aratalim
        amazonPages.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        //sonuc yazisinin nutella icerdigini test edelim
        String actualSonuc= amazonPages.aramaSonucElementi.getText();
        String expectedSonuc="nutella";

        Assert.assertTrue(actualSonuc.contains(expectedSonuc));


    }
}

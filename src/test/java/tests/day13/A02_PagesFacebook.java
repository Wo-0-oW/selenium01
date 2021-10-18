package tests.day13;

import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.TestBase;

public class A02_PagesFacebook extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.facebook.com");
        FacebookPage facebookPage = new FacebookPage(driver);
        facebookPage.mailKutusu.sendKeys("techproed@hotmail.com");
        facebookPage.sifreKutusu.sendKeys("12345");
        facebookPage.loginTusu.click();
    }
}

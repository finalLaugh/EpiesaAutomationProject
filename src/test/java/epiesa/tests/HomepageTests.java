package epiesa.tests;

import epiesa.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTests extends BaseTest {
    HomePage homePage = new HomePage();

    @Test(description = "Verify page title")
    public void homePageTitle() {
        String pageTitle = homePage.getPageTitle();
        Assert.assertEquals(pageTitle, "Catalog piese auto online | +50 magazine in tara", "The title did not match.");
    }

}

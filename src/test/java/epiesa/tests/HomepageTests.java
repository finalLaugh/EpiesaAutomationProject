package epiesa.tests;

import epiesa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTests extends BaseTest {
    HomePage homePage = new HomePage();

    @Test(description = "Verify page title")
    public void homePageTitle() {
        Assert.assertEquals(homePage.getPageTitle(), "Catalog piese auto online | +50 magazine in tara", "The title did not match.");
    }


}

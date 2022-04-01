package epiesa.tests;

import epiesa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTests extends BaseTest {
    HomePage homePage = new HomePage();

    @Test(description = "Verify page title")
    public void homePageTitle() {
        String pageTitle = homePage.getPageTitle();
        Assert.assertEquals(pageTitle, "Catalog piese auto online | +50 magazine in tara", "The title did not match.");
    }

    @Test(description = "Verify welcome message")
    public void homePageGreeting() {
        String greeting = homePage.getWelcomeMessage();
        Assert.assertEquals(greeting, "LA PRET FOARTE BUN!", "The greeting didn't match.");
        Assert.assertTrue(greeting.contains("PRET"), "Welcome message did not match!");
    }

}

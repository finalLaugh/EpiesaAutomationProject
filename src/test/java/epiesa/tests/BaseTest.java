package epiesa.tests;

import epiesa.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends BasePage {

    @BeforeSuite
    public void setUp() {
        Assert.assertTrue(goToHomePage(), "An error occurred while navigating to the home page!");
    }

    @AfterSuite
    public void tearDown() {
        closeBrowser();
    }
}

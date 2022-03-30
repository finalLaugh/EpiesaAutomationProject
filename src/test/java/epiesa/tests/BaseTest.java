package epiesa.tests;

import epiesa.pages.BasePage;
import epiesa.pages.HomePage;
import epiesa.pages.LoginPage;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    public HomePage homePage = new HomePage();
    public LoginPage loginPage = new LoginPage();

    @BeforeSuite
    public void setUp() {
        BasePage.setUp();
    }

    /*@AfterSuite
    public void tearDown() { BasePage.tearDown(); }*/
}

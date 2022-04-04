package epiesa.tests;

import epiesa.pages.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    public HomePage homePage = new HomePage();
    public LoginPage loginPage = new LoginPage();
    public ShoppingCart shoppingCart = new ShoppingCart();
    public Contact contact = new Contact();
    public PieseUniversale pieseUniversale = new PieseUniversale();

    @BeforeSuite
    public void setUp() {
        BasePage.setUp();
    }

    /*@AfterSuite
    public void tearDown() { BasePage.tearDown(); }*/
}

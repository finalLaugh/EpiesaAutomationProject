package epiesa.tests;

import epiesa.pages.*;
import epiesa.pages.contact.Contact;
import epiesa.pages.home.HomePage;
import epiesa.pages.login.LoginPage;
import epiesa.pages.piese.universale.PieseUniversale;
import epiesa.pages.shopping.cart.ShoppingCart;
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

    @AfterSuite(enabled = false)
    public void tearDown() { BasePage.tearDown(); }
}

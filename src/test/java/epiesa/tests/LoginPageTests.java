package epiesa.tests;

import epiesa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void contulMeuButton() {
        loginPage.contulMeuButton("futureisahead@gmail.com", "katana88");
    }

    @Test
    public void register() {
        loginPage.register("futureisahead@gmail.com", "Cas", "Dragos", "katana88", "katana88");
    }
}

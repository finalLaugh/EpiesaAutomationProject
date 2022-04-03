package epiesa.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    @Test(dependsOnMethods = "register")
    public void contulMeuButton() {
        loginPage.hoverOver();
        loginPage.login("futureisahead@gmail.com", "katana88");
        loginPage.hoverOver();
        loginPage.logout();
    }

    @Test
    public void register() {
        loginPage.hoverOver();
        loginPage.register("futureisahead@gmail.com", "Cas", "Dragos", "katana88", "katana88");
    }
}

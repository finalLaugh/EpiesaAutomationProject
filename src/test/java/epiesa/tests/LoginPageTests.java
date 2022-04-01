package epiesa.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    @Test(dependsOnMethods = "register")
    public void contulMeuButton() {
        loginPage.doHover();
        loginPage.login("futureisahead@gmail.com", "katana88");
        loginPage.doHover();
        loginPage.logout();
    }

    @Test
    public void register() {
        loginPage.doHover();
        loginPage.register("futureisahead@gmail.com", "Cas", "Dragos", "katana88", "katana88");
    }
}

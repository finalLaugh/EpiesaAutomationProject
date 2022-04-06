package epiesa.tests;

import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    @Test
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

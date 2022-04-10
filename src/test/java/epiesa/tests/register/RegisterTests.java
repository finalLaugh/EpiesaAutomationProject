package epiesa.tests.register;

import epiesa.tests.BaseTest;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {
    @Test
    public void register() {
        loginPage.hoverOver();
        loginPage.register("ahead@gmail.com", "Cas", "Dragos", "katana88", "katana88");
        loginPage.hoverOver();
        loginPage.logout();
    }
}

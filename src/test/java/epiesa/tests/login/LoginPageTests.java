package epiesa.tests.login;

import epiesa.tests.BaseTest;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    @Test
    public void contulMeuButton() {
        loginPage.hoverOver();
        loginPage.login("futureisahead@gmail.com", "katana88");
        loginPage.hoverOver();
        loginPage.logout();
    }
}

package epiesa.tests.shoppingCart;

import epiesa.tests.BaseTest;
import org.testng.annotations.Test;

public class ShoppingCartTests extends BaseTest {

    @Test
    public void contulMeuButton() {
        shoppingCart.hoverOver();
        loginPage.login("futureisahead@gmail.com", "katana88");
        shoppingCart.shoppingCartTest();
    }
}

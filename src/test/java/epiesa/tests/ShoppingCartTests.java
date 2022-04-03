package epiesa.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShoppingCartTests extends BaseTest {

    @Test
    public void contulMeuButton() {
        shoppingCart.hoverOver();
        loginPage.login("futureisahead@gmail.com", "katana88");
    }

    @Test
    public void shoppingCartFullFunc() {
        shoppingCart.shoppingCartTest();
    }

    @Test(enabled = false)
    public void selectDropDownMenu() {
    }

}

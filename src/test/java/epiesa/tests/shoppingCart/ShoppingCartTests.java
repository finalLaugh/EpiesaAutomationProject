package epiesa.tests.shoppingCart;

import epiesa.tests.BaseTest;
import org.testng.annotations.Test;

public class ShoppingCartTests extends BaseTest {

    @Test
    public void contulMeuButton() {
        shoppingCart.hoverOver();
        loginPage.login("ahead@gmail.com", "katana88");
        shoppingCart.pieseAutoMenu();
        shoppingCart.daciaMarca();
        shoppingCart.loganModel();
        shoppingCart.loganModelLS2004();
        shoppingCart.loganBenzina14();
        shoppingCart.loganBenzina14_75cai();
        shoppingCart.placuteFrana();
        shoppingCart.placuteFranaStarline();
        shoppingCart.tabbedMenu();
        shoppingCart.adaugaInCos();
        shoppingCart.cantitateDropdownMenu();
        shoppingCart.continuaCumparaturile();
        shoppingCart.filtruAer();
        shoppingCart.adaugaInCos2();
        shoppingCart.clickCosulMeu();
        shoppingCart.clickBinIcon();
        shoppingCart.trimiteComanda();
        shoppingCart.numePrenumeTrimiteComanda();
    }
}

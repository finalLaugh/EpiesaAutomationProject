package epiesa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PieseUniversaleTests extends BaseTest {

    @Test
    public void testLogoIsDisplayed() {
        pieseUniversale.pieseUniversaleDropDown();
    }
}
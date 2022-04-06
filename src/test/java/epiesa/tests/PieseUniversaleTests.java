package epiesa.tests;

import org.testng.annotations.Test;

public class PieseUniversaleTests extends BaseTest {

    @Test
    public void pieseUniversaleDropDown() {
        pieseUniversale.pieseUniversaleDropDown();
    }

    @Test(priority = 1)
    public void checkImageVisibility() {
        pieseUniversale.checkThumbnail();

    }
}
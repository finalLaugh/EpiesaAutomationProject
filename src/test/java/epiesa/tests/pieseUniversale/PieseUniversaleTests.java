package epiesa.tests.pieseUniversale;

import epiesa.tests.BaseTest;
import org.testng.annotations.Test;

public class PieseUniversaleTests extends BaseTest {

    @Test
    public void pieseUniversaleDropDown() {
        pieseUniversale.pieseUniversaleDropDown();
        pieseUniversale.checkThumbnail();
        pieseUniversale.takePageScreenshots();
        pieseUniversale.screenShotBrokenImage();
    }
}

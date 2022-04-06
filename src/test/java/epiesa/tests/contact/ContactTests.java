package epiesa.tests.contact;

import epiesa.tests.BaseTest;
import org.testng.annotations.Test;

public class ContactTests extends BaseTest {

    @Test
    public void mailtoValidation() {
        contact.mailToLink();
        contact.checkAnchors();
    }
}

package epiesa.tests;

import org.testng.annotations.Test;

public class ContactTests extends BaseTest {

    @Test
    public void mailtoValidation() {
        contact.mailToLink();
    }

    @Test
    public void checkMailToValidity() {
        contact.checkAnchors();
    }

}
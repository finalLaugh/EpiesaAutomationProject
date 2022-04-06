package epiesa.pages.home;

import epiesa.pages.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String getPageTitle() {

        LOG.info("Check the page title");
        return driver.getTitle();
    }
}
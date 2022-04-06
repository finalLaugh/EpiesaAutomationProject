package epiesa.pages;

public class HomePage extends BasePage {

    public String getPageTitle() {

        LOG.info("Check the page title");
        return driver.getTitle();
    }
}
package epiesa.pages;

public class HomePage extends BasePage {

    public String getPageTitle() {
        return driver.getTitle();
    }
}
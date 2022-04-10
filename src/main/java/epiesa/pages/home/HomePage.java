package epiesa.pages.home;

import epiesa.pages.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    By marciAuto = By.cssSelector("ul[class='bold'] a[title='marci auto']");

    public String getPageTitle() {
        LOG.info("Check the page title");
        return driver.getTitle();
    }
}
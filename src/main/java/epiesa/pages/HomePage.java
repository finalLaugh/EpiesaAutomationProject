package epiesa.pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);

    By welcomeMsg = By.xpath("//span[@class='small bold']");

    public String getPageTitle() {
        LOG.info("Verify home page title.");
        return driver.getTitle();
    }
}

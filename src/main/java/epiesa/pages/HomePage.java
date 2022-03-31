package epiesa.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    By welcomeMsg = By.xpath("//span[@class='small bold']");

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getWelcomeMessage() {
        return driver.findElement(welcomeMsg).getText();
    }
}

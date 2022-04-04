package epiesa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PieseUniversale extends BasePage {

    By pieseUniversale = By.xpath("//div[@class='dropdown pise-universe-dropdown hidden-xs']//div[@class='pise-universe-menu black-bold']");
    By sasiu = By.xpath("//a[@class='a-tab-menu test'][normalize-space()='Sasiu']");
    By conectorEsapament = By.xpath("//img[@alt='CONECTOR ESAPAMENT']");
    By inelEtansare = By.xpath("//img[@alt='INEL ETANSARE']");
    By racorduriFlexibile = By.xpath("//img[@alt='RACORDURI FLEXIBILE']");

    public void pieseUniversaleDropDown() {
        LOG.info("Click on 'Piese universale' drop down menu");
        driver.findElement(pieseUniversale).click();
        sleep(1000);
        LOG.info("Click on 'Sasiu' text link");
        driver.findElement(sasiu).click();
        sleep(1000);
        boolean logo = driver.findElement(inelEtansare).isDisplayed();
        Assert.assertTrue(logo);
    }

//    public boolean checkSasiuLogos() {
//        LOG.info("Check if logo is displayed");
//        return
//    }

    public PieseUniversale scrollIntoView(By locator) {
        scrollElementIntoView(locator);
        return this;
    }
}

package epiesa.pages.contact;

import epiesa.pages.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Contact extends BasePage {

    By contactMenu = By.xpath("//a[normalize-space()='CONTACT']");
    By mailTo = By.cssSelector("a[href='ailto:vanzari@epiesa.ro']");
    private Object WebElement;

    public void mailToLink() {
        LOG.info("Click on 'Contact' menu");
        driver.findElement(contactMenu).click();
        LOG.info("Click on 'Email: vanzari@epiesa.ro' link");
        scrollIntoView(mailTo);
    }

    /**
     * Iterating through every link in the page and finding the 'mailto' broken link.
     */
    public void checkAnchors() {
        List<WebElement> mail = driver.findElements(By.cssSelector("a[href='ailto:vanzari@epiesa.ro']"));

        for (int i = 0; i < mail.size(); i++) {
            WebElement ele = mail.get(i);
            String url = ele.getAttribute("href");

            if (url.equals("ailto:vanzari@epiesa.ro")) {
                Assert.assertEquals("The link is broken.", "mailto:vanzari@epiesa.ro", url);
            }
        }
    }

    /**
     * @param locator - Scroll into view locators that are not yet visible on the page.
     */
    public Contact scrollIntoView(By locator) {
        scrollElementIntoView(locator);
        return this;
    }
}

package epiesa.pages;

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
        List<WebElement> anchors = driver.findElements(By.cssSelector("a[href='ailto:vanzari@epiesa.ro']"));

        for (int i = 0; i < anchors.size(); i++) {
            WebElement ele = anchors.get(i);
            String url = ele.getAttribute("href");

            if (url != "ailto:vanzari@epiesa.ro") {
                Assert.assertEquals("mailto:vanzari@epiesa.ro", url);
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

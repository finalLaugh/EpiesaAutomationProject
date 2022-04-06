package epiesa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PieseUniversale extends BasePage {

    By pieseUniversale = By.xpath("//div[@class='dropdown pise-universe-dropdown hidden-xs']//div[@class='pise-universe-menu black-bold']");
    By sasiu = By.xpath("//a[@class='a-tab-menu test'][normalize-space()='Sasiu']");
    //By conectorEsapament = By.xpath("//img[@alt='CONECTOR ESAPAMENT']");
    //By inelEtansare = By.xpath("//img[@alt='INEL ETANSARE']");
    By racorduriFlexibile = By.xpath("//img[@alt='RACORDURI FLEXIBILE']");
    private Object WebElement;

    public void pieseUniversaleDropDown() {
        LOG.info("Click on 'Piese universale' drop down menu");
        driver.findElement(pieseUniversale).click();
        LOG.info("Click on 'Sasiu' text link");
        driver.findElement(sasiu).click();
        sleep(2000);
    }

    public void checkThumbnail() {
        WebElement inelEtansare = driver.findElement(By.xpath("//img[@alt='INEL ETANSARE' and @src='/images/']"));
        WebElement conectorEsapament = driver.findElement(By.xpath("//img[@alt='CONECTOR ESAPAMENT' and @src='/images/']"));

        // Javascript executor to check image
        Boolean image = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", inelEtansare, conectorEsapament);

        // Verify if status is true
        if (image) {
            System.out.println("Images are visible");
        } else {
            System.out.println("Some images are broken:" + "\n" + inelEtansare + "\n" + conectorEsapament);
        }
    }

    public PieseUniversale scrollIntoView(By locator) {
        scrollElementIntoView(locator);
        return this;
    }
}

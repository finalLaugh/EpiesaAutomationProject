package epiesa.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(BasePage.class);

    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        /*Dimension dimension = new Dimension(1366, 768);
        driver.manage().window().setSize(dimension);*/
        driver.manage().window().maximize();
        String url = "http://epiesa.ro";
        driver.get(url);
        LOG.info("Open browser");
    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void hoverOverElement(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void scrollElementIntoView(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

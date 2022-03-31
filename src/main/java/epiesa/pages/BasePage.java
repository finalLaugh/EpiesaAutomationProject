package epiesa.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

import static org.testng.CommandLineArgs.LOG;

public class BasePage {

    public static WebDriver driver;
    public static Logger LOG = LoggerFactory.getLogger(BasePage.class);

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

    public void goBack() {
        LOG.info("Go back");
        driver.navigate().back();
    }

    public void goForward() {
        LOG.info("Go forward");
        driver.navigate().forward();
    }

    public void refresh() {
        LOG.info("Refresh web page");
        driver.navigate().refresh();
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
}

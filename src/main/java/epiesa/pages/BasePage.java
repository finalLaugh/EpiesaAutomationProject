package epiesa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    protected static WebDriver driver;

    public String browser;
    public String baseURL;
    public Properties properties;

    private void loadProperties() {
        FileInputStream fis = null;
        try {
            properties = new Properties();
            fis = new FileInputStream("src/main/java/epiesa/config/config.properties");
            properties.load(fis);

            browser = properties.getProperty("browser");
            baseURL = properties.getProperty("baseURL");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void openBrowser() {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public boolean goToHomePage() {
        try {
            loadProperties();
            openBrowser();
            driver.get(baseURL);
        } catch (Exception e) {
            System.out.println("Unable to navigate to the homepage");
            e.printStackTrace();
            return false;
        }
        return true;
    }
}


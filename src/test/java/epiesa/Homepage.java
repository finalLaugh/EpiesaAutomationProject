package epiesa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homepage {

    @Test
    public void testHomePage() {
        // Navigate to home page
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://epiesa.ro/");

        // Verify page title

        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Catalog piese auto online | +50 magazine in tara", "The title did not match.");

        // Close browser
        driver.quit();
    }
}

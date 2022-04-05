package epiesa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PieseUniversaleTests extends BaseTest {

    @Test(priority = 1)
    public void pieseUniversaleDropDown() {
        pieseUniversale.pieseUniversaleDropDown();
    }

    @Test(priority = 2)
    public void checkImageVisibility() {
        pieseUniversale.checkThumbnail();

    }
}
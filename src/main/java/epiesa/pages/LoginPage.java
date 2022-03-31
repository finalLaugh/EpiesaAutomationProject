package epiesa.pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class LoginPage extends BasePage {

    By contulMeu = By.xpath("//a[@class='dropdown-toggle ']");
    By logInButton = By.xpath("//li[@class='dropdown hover-dropdown']//ul[@class='dropdown-menu default-menu']//li//a");
    By emailRegister = By.xpath("//input[@name='email']");
    By numeRegister = By.cssSelector("input[name='nume']");
    By prenumeRegister = By.cssSelector("input[name='prenume']");
    By parolaRegister = By.cssSelector("input[name='parola']");
    By parolaRegisterConfirmare = By.cssSelector("input[name='confirmare_parola']");
    By inregistrareButton = By.cssSelector("input[value='INREGISTRARE']");
    By emailLogin = By.xpath("//input[@name='login_utilizator']");
    By parolaLogin = By.xpath("//input[@name='login_parola']");
    By autentificare = By.xpath("//button[normalize-space()='Autentificare']");
    By googleSuntDeAcord = By.xpath("//div[text()='Sunt de acord']");
    By googleSearchButton = By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']");
    By googleSearchField = By.xpath("//input[@name='q']");

    public void contulMeuButton(String email, String parola) {
        LOG.info("Hover on 'Contul meu'");
        driver.findElement(contulMeu).click();
        LOG.info("Click on 'Login / Cont nou' button");
        driver.findElement(logInButton).click();
        sleep(1000);
        LOG.info("Complete login email.");
        driver.findElement(emailLogin).click();
        driver.findElement(emailLogin).sendKeys(email);
        LOG.info("Complete parola.");
        driver.findElement(parolaLogin).click();
        driver.findElement(parolaLogin).sendKeys(parola);
        sleep(1000);
        LOG.info("Click on 'Autentificare'");
        driver.findElement(autentificare).submit();
        driver.navigate().to("http://google.com");
        driver.findElement(googleSuntDeAcord).click();
        driver.findElement(googleSearchField).click();
        driver.findElement(googleSearchField).sendKeys("test search");
        sleep(2000);
        //driver.findElement(googleSearchButton).submit();
        driver.navigate().refresh();
        sleep(2000);
        driver.navigate().back();
        sleep(2000);
        driver.navigate().forward();
    }

    public void register(String email, String nume, String prenume, String parola, String confParola) {
        LOG.info("Complete e-mail address.");
        driver.findElement(emailRegister).click();
        sleep(1000);
        driver.findElement(emailRegister).sendKeys(email);
        LOG.info("Complete nume.");
        driver.findElement(numeRegister).click();
        sleep(1000);
        driver.findElement(numeRegister).sendKeys(nume);
        LOG.info("Complete prenume.");
        driver.findElement(prenumeRegister).click();
        sleep(1000);
        driver.findElement(prenumeRegister).sendKeys(prenume);
        LOG.info("Complete parola.");
        driver.findElement(parolaRegister).click();
        sleep(1000);
        driver.findElement(parolaRegister).sendKeys(parola);
        LOG.info("Complete confirma parola.");
        driver.findElement(parolaRegisterConfirmare).click();
        sleep(1000);
        driver.findElement(parolaRegisterConfirmare).sendKeys(confParola);
        LOG.info("Click on 'Inregistrare'");
        sleep(1000);
        driver.findElement(inregistrareButton).submit();
    }
}

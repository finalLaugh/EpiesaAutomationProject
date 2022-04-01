package epiesa.pages;

import org.openqa.selenium.By;

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
    By delogare = By.xpath("(//a[normalize-space()='DELOGHEAZA-MA'])[2]");

    public LoginPage doHover() {
        LOG.info("Hover on 'Contul meu'");
        hoverOverElement(contulMeu);
        return this;
    }

    public void logout() {
        LOG.info("Click on 'Delogheaza-ma'");
        driver.findElement(delogare).click();
    }

    public void login(String email, String parola) {
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
    }

    public void register(String email, String nume, String prenume, String parola, String confParola) {
        LOG.info("Click on 'Login / Cont nou' button");
        driver.findElement(logInButton).click();
        sleep(500);
        LOG.info("Complete e-mail address.");
        driver.findElement(emailRegister).click();
        sleep(500);
        driver.findElement(emailRegister).sendKeys(email);
        LOG.info("Complete nume.");
        driver.findElement(numeRegister).click();
        sleep(500);
        driver.findElement(numeRegister).sendKeys(nume);
        LOG.info("Complete prenume.");
        driver.findElement(prenumeRegister).click();
        sleep(500);
        driver.findElement(prenumeRegister).sendKeys(prenume);
        LOG.info("Complete parola.");
        driver.findElement(parolaRegister).click();
        sleep(500);
        driver.findElement(parolaRegister).sendKeys(parola);
        LOG.info("Complete confirma parola.");
        driver.findElement(parolaRegisterConfirmare).click();
        sleep(500);
        driver.findElement(parolaRegisterConfirmare).sendKeys(confParola);
        LOG.info("Click on 'Inregistrare'");
        sleep(500);
        driver.findElement(inregistrareButton).submit();
    }
}

package epiesa.pages.shopping.cart;

import epiesa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart extends BasePage {

    By contulMeu = By.xpath("//a[@class='dropdown-toggle ']");
    By pieseAutoMenu = By.cssSelector("a[title='piese auto dupa marca']");
    By daciaLogo = By.xpath("//img[@alt='piese auto dacia']");
    By loganLogo = By.cssSelector("p[class='margin-bottom-0'] a[title='piese auto dacia logan']");
    By loganModel = By.xpath("//img[@class='car-img-1 img-responsive']");
    By loganEngine = By.xpath("//a[normalize-space()='1.4']");
    By loganHorse = By.cssSelector("a[title='piese auto dacia logan 1.4 benzina 75 cai ']");
    By placuteFrana = By.xpath("//a[normalize-space()='Placute frana']");
    By starlineBDS025 = By.xpath("//a[@class='a-tag gg-tag' and contains(text(),'STARLINE BDS025')]");
    By continutPachet = By.xpath("//a[normalize-space()='Continut pachet']");
    By review = By.xpath("//a[normalize-space()='Review-uri (0)']");
    By piesaVecheLaSchimb = By.xpath("//a[normalize-space()='Piesa veche la schimb']");
    By adaugaInCos = By.xpath("//button[normalize-space()='ADAUGA IN COS']");
    By cosulMeu = By.xpath("//a[@class='dropdown-toggle a-tag']//img[@class='cart-icon']");
    By selectCant = By.xpath("//div[@class='input_form']/select");
    By continuaCumparaturile = By.cssSelector("div[class='col-xs-12 col-sm-3'] button[class='btn_yellow']");
    By filtruAer = By.cssSelector("p a[title='Filtru aer DACIA LOGAN (LS_) 1.4 (LSOA, LSOC, LSOE, LSOG) benzina 75 cai']");
    By filtruAerMT6250 = By.xpath("//form[@id='adauga_piesa_cos_6404709']//button[@class='btn_red'][normalize-space()='ADAUGA IN COS']");
    By cosStergereProdus = By.cssSelector("div[class='battery_box'] div:nth-child(1) div:nth-child(2) div:nth-child(1) a:nth-child(1) img:nth-child(1)");
    By trimiteComanda = By.xpath("//input[@value='TRIMITE COMANDA']");
    By numeSiPrenume = By.cssSelector("input[name='nume_prenume']");

    public ShoppingCart hoverOver() {
        LOG.info("Hover on 'Contul meu'");
        hoverOverElement(contulMeu);
        return this;
    }

    public void pieseAutoMenu() {
        LOG.info("Click on 'Piese Auto' menu");
        driver.findElement(pieseAutoMenu).click();
    }

    public void daciaMarca() {
        LOG.info("Click on 'Dacia' logo");
        driver.findElement(daciaLogo).click();
    }

    public void loganModel() {
        LOG.info("Click on 'LOGAN' logo/link");
        scrollIntoView(loganLogo);
        sleep(1000);
        driver.findElement(loganLogo).click();
    }

    public void loganModelLS2004() {
        LOG.info("Click on 'LOGAN' model");
        driver.findElement(loganModel).click();
    }

    public void loganBenzina14() {
        LOG.info("Click on 1.4 - 75 cai");
        driver.findElement(loganEngine).click();
    }

    public void loganBenzina14_75cai() {
        LOG.info("Click on 1.4 - 75 cai");
        driver.findElement(loganHorse).click();
    }

    public void placuteFrana() {
        LOG.info("Click on 'Placute frana' link");
        scrollIntoView(placuteFrana);
        sleep(1000);
        driver.findElement(placuteFrana).click();
    }

    public void placuteFranaStarline() {
        LOG.info("Click on 'PLACUTE FRANA DACIA LOGAN (LS_) 1.4 (LSOA, LSOC, LSOE, LSOG) BENZINA 75 CAI STARLINE BDS025' link");
        driver.findElement(starlineBDS025).click();
    }

    public void tabbedMenu() {
        LOG.info("Click on 'Continut pachet' tab");
        scrollIntoView(continutPachet);
        sleep(1000);
        driver.findElement(continutPachet).click();
        LOG.info("Click on 'Review-uri' tab");
        driver.findElement(review).click();
        LOG.info("Click on 'Piesa veche la schimb' tab");
        driver.findElement(piesaVecheLaSchimb).click();
    }

    public void adaugaInCos() {
        LOG.info("Click on 'Adauga in cos' button");
        scrollIntoView(adaugaInCos);
        sleep(1000);
        driver.findElement(adaugaInCos).click();
        LOG.info("Click on 'Cosul meu' button");
        driver.findElement(cosulMeu).click();
    }

    public void cantitateDropdownMenu() {
        LOG.info("Click on quantity drop-down menu and select 2");
        selectDropdown("2");
        sleep(1000);
    }

    public void continuaCumparaturile() {
        LOG.info("Click on 'Continua cumparaturile' button");
        driver.findElement(continuaCumparaturile).click();
    }

    public void filtruAer() {
        LOG.info("Click on 'Filtru aer' text link");
        driver.findElement(filtruAer).click();
    }

    public void adaugaInCos2() {
        LOG.info("Click on 'Adauga in cos' button");
        driver.findElement(filtruAerMT6250).click();
    }

    public void clickCosulMeu() {
        LOG.info("Click on 'Cosul meu' button");
        driver.findElement(cosulMeu).click();
    }

    public void clickBinIcon() {
        LOG.info("Click on 'Bin' button");
        driver.findElement(cosStergereProdus).click();
    }

    public void trimiteComanda() {
        LOG.info("Click on 'Trimite Comanda' button");
        driver.findElement(trimiteComanda).click();
        sleep(1000);
        driver.switchTo().alert().accept();
    }

    public void numePrenumeTrimiteComanda() {
        LOG.info("Complete Nume si Prenume field");
        scrollIntoView(numeSiPrenume);
        sleep(1000);
        driver.findElement(numeSiPrenume).click();
        driver.findElement(numeSiPrenume).sendKeys("Dragos Cas");
        LOG.info("Click on 'Trimite Comanda' button");
        driver.findElement(trimiteComanda).click();
        sleep(1000);
        driver.switchTo().alert().accept();
    }

    public ShoppingCart scrollIntoView(By locator) {
        scrollElementIntoView(locator);
        return this;
    }

    public ShoppingCart selectDropdown(String option) {
        Select down = new Select(driver.findElement(selectCant));
        down.selectByValue(option);
        return this;
    }
}

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
        sleep(1000);
        LOG.info("Click on 'Sasiu' text link");
        driver.findElement(sasiu).click();
        sleep(1000);
    }

    public void checkThumbnail() {
        WebElement inelEtansare = driver.findElement(By.xpath("//img[@alt='INEL ETANSARE']"));
        WebElement conectorEsapament = driver.findElement(By.xpath("//img[@alt='CONECTOR ESAPAMENT']"));
        // Javascript executor to check image
        Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", inelEtansare, conectorEsapament);

        // Verify if status is true
        if (p) {
            System.out.println("Images are visible");
        } else {
            System.out.println("Some images are broken:" + "\n" + inelEtansare + "\n" + conectorEsapament);
        }
    }

    public PieseUniversale scrollIntoView(By locator) {
        scrollElementIntoView(locator);
        return this;
    }

    /*public static void checkForBrokenImagesJsoup() throws Exception {
        //driver.get("https://www.epiesa.ro/accesorii-auto/sasiu/");

        Document doc = Jsoup.connect("https://www.epiesa.ro/accesorii-auto/sasiu/").get();
        Elements images = doc.select("img");
        for (Element image : images) {
            String imageSrc = image.attr("src");

            try {
                URL url = new URL(imageSrc);
                url.openConnection();
                URLConnection urlConnection = url.openConnection();
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.connect();

                if (httpURLConnection.getResponseCode() == 200) {
                    System.out.println(imageSrc + " >> " + httpURLConnection.getResponseCode() + " >> " + httpURLConnection.getResponseMessage());
                } else {
                    System.err.println(imageSrc + " >> " + httpURLConnection.getResponseCode() + " >> " + httpURLConnection.getResponseMessage());
                }
                httpURLConnection.disconnect();
            } catch (IOException e) {
                System.err.println(imageSrc);
            }
        }
    }*/

    /*public void checkForBrokenImages() throws Exception {
        driver.get("https://www.epiesa.ro/accesorii-auto/sasiu/");
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size());

        for (WebElement image : images) {
            String imageSrc = image.getAttribute("src");

            try {
                URL url = new URL(imageSrc);
                url.openConnection();
                URLConnection urlConnection = url.openConnection();
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.connect();

                if (httpURLConnection.getResponseCode() == 200) {
                    System.out.println(imageSrc + " >> " + httpURLConnection.getResponseCode() + " >> " + httpURLConnection.getResponseMessage());
                } else {
                    System.err.println(imageSrc + " >> " + httpURLConnection.getResponseCode() + " >> " + httpURLConnection.getResponseMessage());
                }
                httpURLConnection.disconnect();
            } catch (IOException e) {
                System.err.println(imageSrc);
            }
        }
    }*/

}

package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class Cart extends BrowserDriver {

    public static String cartProductName = "//*[@id=\"tbodyid\"]/tr/td[2]";

    public static String placeOrderButtonXpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button";

    public static String placeOrderPopUpTitleXpath = "//*[@id=\"orderModalLabel\"]";

    public static String nameFieldXpath = "//input[@id=\"name\"]";

    public static String countryFieldXpath = "//input[@id=\"country\"]";

    public static String cityFieldXpath = "//input[@id=\"city\"]";

    public static String creditCardFieldXpath = "//input[@id=\"card\"]";

    public static String monthFieldXpath = "//input[@id=\"month\"]";

    public static String yearFieldXpath = "//input[@id=\"year\"]";

    public static String purchaseButtonXpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]";

    public static String purchaseSuccessTextXpath = "/html/body/div[10]/h2";

    public static void clickPlaceOrderButton() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElement(By.xpath(placeOrderButtonXpath)).click();
    }

    public static void verifyPaymentPopUp() throws InterruptedException {
        Thread.sleep(5000);

        String actualTitle = driver.findElement(By.xpath(placeOrderPopUpTitleXpath)).getText();
        Assert.assertEquals("Place order", actualTitle);
    }

    public static void inputValidData() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(By.xpath(nameFieldXpath)).sendKeys("Angela");
        driver.findElement(By.xpath(countryFieldXpath)).sendKeys("India");
        driver.findElement(By.xpath(cityFieldXpath)).sendKeys("Delhi");
        driver.findElement(By.xpath(creditCardFieldXpath)).sendKeys("1678534437575432");
        driver.findElement(By.xpath(monthFieldXpath)).sendKeys("06");
        driver.findElement(By.xpath(yearFieldXpath)).sendKeys("25");
    }

    public static void clickPurchaseButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(purchaseButtonXpath)).click();
    }

    public static void verifySuccessPurchasePopUp() throws InterruptedException {
        Thread.sleep(2000);

        String actualText = driver.findElement(By.xpath(purchaseSuccessTextXpath)).getText();
        Assert.assertEquals("Thank you for your purchase!", actualText);
    }
}
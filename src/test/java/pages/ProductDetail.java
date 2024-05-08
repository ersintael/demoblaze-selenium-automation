package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ProductDetail extends BrowserDriver {
    public static String actualProductNameXpath = "//h2[@class=\"name\"]";

    public static String actualProductPriceXpath = "//h3[@class=\"price-container\"]";

    public static String actualProductDescXpath = "//*[@id=\"more-information\"]/p";

    public static String addToCartButtonXpath = "//*[@id=\"tbodyid\"]/div[2]/div/a";

    public static String cartNavBarXpath = "//*[@id=\"navbarExample\"]/ul/li[4]/a";

    public static void verifyProductName() throws InterruptedException {
        Thread.sleep(5000);
        String actualProductName = driver.findElement(By.xpath(actualProductNameXpath)).getText();

        Assert.assertEquals(product_Name, actualProductName);
    }

    public static void clickAddToCartButton() throws InterruptedException {
        Thread.sleep(5000);
        product_Name_Cart = driver.findElement(By.xpath(actualProductNameXpath)).getText();
        driver.findElement(By.xpath(addToCartButtonXpath)).click();
    }

    public static void verifyProductAddedToCart() throws InterruptedException {
        Thread.sleep(2000);
        String successAddToCart = "Product added";
        String actualSuccessAddToCart = driver.switchTo().alert().getText();
        Assert.assertEquals(successAddToCart,actualSuccessAddToCart);
    }

    public static void goToCartPage() throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath(cartNavBarXpath)).click();

    }

    public static void productPriceIsVisible() {
        Assert.assertTrue(driver.findElement(By.xpath(actualProductPriceXpath)).isDisplayed());
    }

    public static void productDescIsVisible() {
        Assert.assertTrue(driver.findElement(By.xpath(actualProductDescXpath)).isDisplayed());
    }


}

package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ProductDetail extends BrowserDriver {
    public static String actual_product_Name_xpath = "//h2[@class=\"name\"]";

    public static String actual_product_Price_xpath = "//h3[@class=\"price-container\"]";

    public static String actual_product_Desc_xpath = "//*[@id=\"more-information\"]/p";

    public static String addToCart_Button_xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a";

    public static String cart_NavBar_xpath;

    public static void verifyProductName() throws InterruptedException {
        Thread.sleep(5000);
        String actualProductName = driver.findElement(By.xpath(actual_product_Name_xpath)).getText();

        Assert.assertEquals(product_Name, actualProductName);
    }

    public static void clickAddToCartButton() throws InterruptedException {
        Thread.sleep(5000);
        product_Name_Cart = driver.findElement(By.xpath(actual_product_Name_xpath)).getText();
        driver.findElement(By.xpath(addToCart_Button_xpath)).click();
    }

    public static void verifyProductAddedToCart() throws InterruptedException {
        Thread.sleep(2000);
        String successAddToCart = "Product added";
        String actualSuccessAddToCart = driver.switchTo().alert().getText();
        Assert.assertEquals(successAddToCart,actualSuccessAddToCart);
    }

    public static void go_To_Cart_Page() throws InterruptedException {
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath(cart_NavBar_xpath)).click();

    }


}

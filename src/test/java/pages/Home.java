package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class Home extends BrowserDriver {

    public static String signUpNavbarXpath = "//*[@id=\"signin2\"]";

    public static String logInNavbarXpath = "//*[@id=\"login2\"]";

    public static String logOutNavbarXpath = "//*[@id=\"logout2\"]";

    public static String nameOfUserNavbarXpath = "//*[@id=\"nameofuser\"]";

    public static String signUpPopUpTextXpath = "//*[@id=\"signInModalLabel\"]";

    public static String usernameFieldSignUpXpath = "//input[@id=\"sign-username\"]";

    public static String passwordFieldSignUpXpath = "//input[@id=\"sign-password\"]";

    public static String signUpButtonXpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";

    public static String logInPopUpTextXpath = "//*[@id=\"logInModalLabel\"]";

    public static String usernameFieldLogInXpath = "//input[@id=\"loginusername\"]";

    public static String passwordFieldLogInXpath = "//input[@id=\"loginpassword\"]";

    public static String logInButtonXpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";

    public static String productOneXpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a";

    public static String productTwoXpath = "//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a";

    public static void openHome() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
    }

    public static void clickSignUpNavbar() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(signUpNavbarXpath)).click();
    }

    public static void inputUsernameSignUp() throws InterruptedException {
        Thread.sleep(5000);
        username = randomString(10);
        driver.findElement(By.xpath(usernameFieldSignUpXpath)).sendKeys(username);
        System.out.println("username: " + username);
    }

    public static void inputPasswordSignUp() throws InterruptedException {
        password = randomString(8);
        driver.findElement(By.xpath(passwordFieldSignUpXpath)).sendKeys(password);
        System.out.println("password: " + password);
    }

    public static void clickSignUpButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(signUpButtonXpath)).click();
    }

    public static void validateSignUpSuccess() throws  InterruptedException {
        Thread.sleep(2000);
        String successSignUp = "Sign up successful.";
        String actualSuccessSignUp = driver.switchTo().alert().getText();
        Assert.assertEquals(successSignUp,actualSuccessSignUp);
    }

    public static void clickLogInNavbar() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(logInNavbarXpath)).click();
    }

    public static void inputUsernameLogIn() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(usernameFieldLogInXpath)).sendKeys(username);
    }

    public static void inputPasswordLogIn() throws InterruptedException {
        driver.findElement(By.xpath(passwordFieldLogInXpath)).sendKeys(password);
    }

    public static void clickLogInButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(logInButtonXpath)).click();
    }

    public static void usernameMatchNameOfUser() throws InterruptedException {
        Thread.sleep(5000);
        String showedOnNavbar = driver.findElement(By.xpath(nameOfUserNavbarXpath)).getText();

        String actualUser = showedOnNavbar.substring(8);
        Assert.assertEquals(username, actualUser);
    }

    public static void logOutMenuVisible() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath(logOutNavbarXpath)).isDisplayed());
    }

    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public static void clickProductOne() throws InterruptedException {
        Thread.sleep(2000);
        WebElement productOne = driver.findElement(By.xpath(productOneXpath));
        product_Name = productOne.getText();

        productOne.click();
    }

    public static String randomString(int length) {
        String pool = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomWord = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = (int)(pool.length()* Math.random());
            randomWord.append(pool.charAt(index));
        }
        return randomWord.toString();
    }


}

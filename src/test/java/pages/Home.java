package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class Home extends BrowserDriver {

    public static String signUp_Navbar_xpath = "//*[@id=\"signin2\"]";

    public static String logIn_Navbar_xpath = "//*[@id=\"login2\"]";

    public static String logOut_Navbar_xpath = "//*[@id=\"logout2\"]";

    public static String nameOfUser_Navbar_xpath = "//*[@id=\"nameofuser\"]";

    public static String signUp_PopUp_Text_xpath = "//*[@id=\"signInModalLabel\"]";

    public static String username_Field_SignUp_xpath = "//input[@id=\"sign-username\"]";

    public static String password_Field_SignUp_xpath = "//input[@id=\"sign-password\"]";

    public static String signUp_Button_xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";

    public static String logIn_PopUp_Text_xpath = "//*[@id=\"logInModalLabel\"]";

    public static String username_Field_LogIn_xpath = "//input[@id=\"loginusername\"]";

    public static String password_Field_LogIn_xpath = "//input[@id=\"loginpassword\"]";

    public static String logIn_Button_xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";

    public static String product_One_xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a";

    public static String product_Two_xpath = "//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a";

    public static void open_Home() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
    }

    public static void click_SignUp_Navbar() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(signUp_Navbar_xpath)).click();
    }

    public static void input_Username_SignUp() throws InterruptedException {
        Thread.sleep(5000);
        username = randomString(10);
        driver.findElement(By.xpath(username_Field_SignUp_xpath)).sendKeys(username);
        System.out.println("username: " + username);
    }

    public static void input_Password_SignUp() throws InterruptedException {
        password = randomString(8);
        driver.findElement(By.xpath(password_Field_SignUp_xpath)).sendKeys(password);
        System.out.println("password: " + password);
    }

    public static void click_SignUp_Button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(signUp_Button_xpath)).click();
    }

    public static void validate_SignUp_Success() throws  InterruptedException {
        Thread.sleep(2000);
        String successSignUp = "Sign up successful.";
        String actualSuccessSignUp = driver.switchTo().alert().getText();
        Assert.assertEquals(successSignUp,actualSuccessSignUp);
    }

    public static void click_LogIn_Navbar() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(logIn_Navbar_xpath)).click();
    }

    public static void input_Username_LogIn() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(username_Field_LogIn_xpath)).sendKeys(username);
    }

    public static void input_Password_LogIn() throws InterruptedException {
        driver.findElement(By.xpath(password_Field_LogIn_xpath)).sendKeys(password);
    }

    public static void click_LogIn_Button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(logIn_Button_xpath)).click();
    }

    public static void username_Match_Name_Of_User() throws InterruptedException {
        Thread.sleep(5000);
        String showedOnNavbar = driver.findElement(By.xpath(nameOfUser_Navbar_xpath)).getText();

        String actualUser = showedOnNavbar.substring(8);
        Assert.assertEquals(username, actualUser);
    }

    public static void logOut_Menu_Visible() throws InterruptedException {
        driver.findElement(By.xpath(logOut_Navbar_xpath)).isDisplayed();
    }

    public static void close_Browser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public static void click_Product_One() throws InterruptedException {
        Thread.sleep(2000);
        WebElement productOne = driver.findElement(By.xpath(product_One_xpath));
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

package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.Home.*;
import static pages.ProductDetail.*;

public class Home {
    @When("User click on any product")
    public void user_click_on_any_product() throws InterruptedException {
        clickProductOne();
    }

    @Then("User see product name")
    public void user_see_product_name() throws InterruptedException {
        verifyProductName();
    }

    @Then("User see product price")
    public void user_see_product_price() throws InterruptedException {
        productPriceIsVisible();
    }

    @Then("User see product description")
    public void user_see_product_description() throws InterruptedException {
        productDescIsVisible();
        closeBrowser();
    }
}

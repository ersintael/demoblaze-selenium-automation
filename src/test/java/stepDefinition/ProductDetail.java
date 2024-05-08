package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.Home.*;
import static pages.ProductDetail.*;

public class ProductDetail {
    @Given("User already on Product Detail page")
    public void user_already_on_product_detail_page() throws InterruptedException {
        openHome();
        clickProductOne();
    }

    @When("User click on Add to cart button")
    public void user_click_on_add_to_cart_button() throws InterruptedException {
        clickAddToCartButton();
    }

    @Then("Product is added into the cart")
    public void product_is_added_into_the_cart() throws InterruptedException {
        verifyProductAddedToCart();
        closeBrowser();

    }
}

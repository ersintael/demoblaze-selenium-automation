package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.Home.*;
import static pages.ProductDetail.*;

public class Cart {
    @Given("User already on Cart page")
    public void user_already_on_cart_page() throws InterruptedException {
        open_Home();
        click_Product_One();
        clickAddToCartButton();
        go_To_Cart_Page();
    }

    @Given("User click on Place Order button")
    public void user_click_on_place_order_button() {
    }

    @When("User input valid data")
    public void user_input_valid_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User click on Purchase button")
    public void user_click_on_purchase_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User see success purchase pop-up")
    public void user_see_success_purchase_pop_up() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.Home.*;
import static pages.ProductDetail.*;
import static pages.Cart.*;

public class Cart {
    @Given("User already on Cart page")
    public void user_already_on_cart_page() throws InterruptedException {
        openHome();
        clickProductOne();
        clickAddToCartButton();
        goToCartPage();
    }

    @Given("User click on Place Order button")
    public void user_click_on_place_order_button() throws InterruptedException {
        clickPlaceOrderButton();
    }

    @When("User see Payment pop up")
    public void user_see_payment_pop_up() throws InterruptedException {
        verifyPaymentPopUp();
    }

    @When("User input valid data")
    public void user_input_valid_data() throws InterruptedException {
        inputValidData();
    }

    @When("User click on Purchase button")
    public void user_click_on_purchase_button() throws InterruptedException {
        clickPurchaseButton();
    }

    @Then("User see success purchase pop-up")
    public void user_see_success_purchase_pop_up() throws InterruptedException {
        verifySuccessPurchasePopUp();
        closeBrowser();
    }
}

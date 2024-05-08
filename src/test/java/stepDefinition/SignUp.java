package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.Home.*;

public class SignUp {

    @Given("User click Sign Up menu")
    public void user_click_Sign_Up_menu() throws InterruptedException {
        clickSignUpNavbar();
    }

    @Given("User already on Home page")
    public void user_already_on_home_page() throws InterruptedException {
        openHome();
    }

    @When("User input valid username")
    public void user_input_valid_username() throws InterruptedException {
        inputUsernameSignUp();
    }

    @When("User input valid password")
    public void user_input_valid_password() throws InterruptedException {
        inputPasswordSignUp();
    }

    @When("User click on Sign up button")
    public void user_click_on_sign_up_button() throws InterruptedException {
        clickSignUpButton();
    }

    @Then("User see success sign up pop-up")
    public void user_see_success_sign_up_pop_up() throws InterruptedException {
        validateSignUpSuccess();
        closeBrowser();
    }
}

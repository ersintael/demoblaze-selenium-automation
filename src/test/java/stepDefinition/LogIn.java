package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.Home.*;

public class LogIn {
    @Given("User click Log In menu")
    public void user_click_log_in_menu() throws InterruptedException {
        click_LogIn_Navbar();
    }

    @When("User input valid login username")
    public void user_input_valid_login_username() throws InterruptedException {
        input_Username_LogIn();
    }

    @When("User input valid login password")
    public void user_input_valid_login_password() throws InterruptedException {
        input_Password_LogIn();
    }

    @When("User click on Log In button")
    public void user_click_on_log_in_button() throws InterruptedException {
        click_LogIn_Button();
    }

    @Then("User see username on Navbar")
    public void user_see_username_on_navbar() throws InterruptedException {
        username_Match_Name_Of_User();
    }

    @Then("User see Log out menu on Navbar")
    public void user_see_log_out_menu_on_navbar() throws InterruptedException {
        logOut_Menu_Visible();
        close_Browser();
    }
}

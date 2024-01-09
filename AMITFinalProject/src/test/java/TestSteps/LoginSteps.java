package TestSteps;

import TestBase.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends TestBase {

Pages.Login LoginObj = new Pages.Login(driver);

    @Given("user go to login page")
    public void user_go_to_login_page() {
        LoginObj.PressOnLogin();
    }


    @And("user login with valid email")
    public void user_login_with_valid_email() {
        LoginObj.EnterEmail("test@example.com");
    }

    @And("user login with valid password")
    public void user_login_with_valid_password() {
        LoginObj.EnterPassword("P@ssw0rd");
    }

    @And("user press on login button")
    public void user_press_on_login_button() {
        LoginObj.PressOnLoginButton();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        LoginObj.ProcessIsSuccess();
    }

    @Given("user login with invalid email")
    public void user_login_with_invalid_email() {
        LoginObj.EnterEmail("wrong@example.com");
    }

    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        LoginObj.ProcessIsNotSuccess();
    }

}

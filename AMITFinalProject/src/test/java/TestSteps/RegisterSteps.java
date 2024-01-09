package TestSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static TestBase.TestBase.driver;


public class RegisterSteps {
    Pages.Register RegisterObj = new Pages.Register(driver);

    @Given("user go to register page")
    public void user_go_to_register_page() {
        RegisterObj.OpenRegisterPage();
    }
    @And("user select gender type")
    public void user_select_gender_type() {
        RegisterObj.SelectGender();
    }
    @And("user enter first name")
    public void user_enter_first_name() {
        RegisterObj.EnterFirstName("automation");
    }
    @And("user enter last name")
    public void user_enter_last_name() {
        RegisterObj.EnterLastName("tester");
    }
    @And("user select day")
    public void user_select_day() {
        RegisterObj.SelectDay();
    }
    @And("user select month")
    public void user_select_month() {
        RegisterObj.SelectMonth();
    }
    @And("user select year")
    public void user_select_year() {
        RegisterObj.SelectYear();
    }
    @And("user enter email")
    public void user_enter_email() {
        RegisterObj.EnterEmail("test@example.com");
    }
    @And("user password")
    public void user_password() {
        RegisterObj.EnterPassword("P@ssw0rd");
    }
    @And("User confirm password")
    public void user_confirm_password() {
        RegisterObj.EnterConfirmPassword("P@ssw0rd");
    }
    @And("user clicks on register button")
    public void user_clicks_on_register_button() {
        RegisterObj.PressOnRegisterButton();
    }
    @Then("success message is display")
    public void success_message_is_display() {
        RegisterObj.PressOnContinueButton();
    }
}

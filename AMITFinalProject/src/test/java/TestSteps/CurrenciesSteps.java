package TestSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static TestBase.TestBase.driver;

public class CurrenciesSteps {
    Pages.Currencies Currenciesobj = new Pages.Currencies(driver);

    @Given("user open Home page")
    public void user_open_home_page() {
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }

    @Given("user select currency from home page")
    public void user_select_currency_from_home_page() {
       Currenciesobj.SelectCurrency();
    }

    @Then("selection process is successfully")
    public void selection_process_is_successfully() {
        System.out.println("Selection process is successfully");
    }

}

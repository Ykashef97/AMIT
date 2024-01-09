package TestSteps;

import Pages.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import static TestBase.TestBase.driver;

public class SearchSteps {

    Pages.Search searchobj = new Pages.Search(driver);

    String SearchBarText = "SCI_FAITH";


    @Given("user enter keyword inside search bar")
    public void user_enter_keyword_inside_search_bar() {
        searchobj.EnterKeyword("book");
        // user will test first test case with this data  book, laptop, nike
    }

    @Given("user press on search")
    public void user_press_on_search() {
        searchobj.PressOnSearchBar();

    }

    @Given("check the URL")
    public void check_the_url() {
            Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Search");
    }

    @Then("loop over the results and verify each item contain the search keyword")
    public void loop_over_the_results_and_verify_each_item_contain_the_search_keyword() {
        searchobj.loop_over_the_results_and_verify();
    }






}

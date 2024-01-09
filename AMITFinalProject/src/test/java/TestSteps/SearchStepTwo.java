package TestSteps;

import Pages.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static TestBase.TestBase.driver;

public class SearchStepTwo {
    Search searchobj = new Search(driver);
    String SearchBarText = "SCI_FAITH";
    @Given("user enter keyword in search bar")
    public void user_enter_keyword_in_search_bar() {
        searchobj.EnterKeyword("SCI_FAITH");
        // user will test Second test case with this data  SCI_FAITH, APPLE_CAM, SF_PRO_11
    }
    @Given("user press on search bar")
    public void user_press_on_search_bar() {
        searchobj.PressOnSearchBar();

    }

    @Given("User press on product")
    public void user_press_on_product() {
       searchobj.PressOnProduct();
    }

    @Then("check that the sku you are using  in search is appears")
    public void check_that_the_sku_you_are_using_in_search_is_appears() {
        Assert.assertEquals(searchobj.GetSkuText(), SearchBarText );
    }

}

package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class WebOrdersHomework {
    WebDriver driver = Driver.getDriver("chrome");

    @Given("User navigates to order list")
    public void user_navigates_to_order_list() {

    }




    @When("User provided his information")
    public void user_provided_his_information(String username, String password) {


    }

    @Then("User validates that his name edited")
    public void user_validates_that_his_name_edited() {

    }

}

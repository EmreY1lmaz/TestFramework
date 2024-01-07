package com.TestCompany.step_definitions;

import com.TestCompany.pages.SearchPage;
import com.TestCompany.utilities.ConfigurationReader;
import com.TestCompany.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class SearchSteps_StepDef {

    SearchPage searchPage =new SearchPage();

    @Given("I navigate to the search engine page")
    public void i_navigate_to_the_search_engine_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("I submit the search term {string}")
    public void i_submit_the_search_term(String term) {
       searchPage.searchBox.sendKeys(term+ Keys.ENTER);
    }
    @Then("the first result should contain the search term")
    public void the_first_result_should_contain_the_search_term() {
        String resultText = searchPage.firstResult.getText().toLowerCase();
        Assert.assertTrue(resultText.contains("Clover"));
    }
}

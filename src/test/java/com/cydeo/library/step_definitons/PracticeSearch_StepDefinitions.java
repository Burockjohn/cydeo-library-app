package com.cydeo.library.step_definitons;

import com.cydeo.library.pages.ExpandTestinMainPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeSearch_StepDefinitions {

    ExpandTestinMainPage mainPage = new ExpandTestinMainPage();
//    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Given("user is on the main page of {string}")
    public void user_is_on_the_main_page_of(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty(string));
    }

    @When("user enters {string} into search box")
    public void user_enters_into_search_box(String string) {
        mainPage.inputSearch.sendKeys(string);
//        BrowserUtils.sleep(2);
    }

    @Then("user should see {int} as a number of elements")
    public void user_should_see_as_a_number_of_elements(Integer int1) {
        int expected = int1;
        BrowserUtils.sleep(2);
        int actual = mainPage.listedElements.size();
        Assert.assertEquals(expected, actual);
    }

    @When("user refresh the page")
    public void user_refresh_the_page() {
        Driver.getDriver().navigate().refresh();
    }

}

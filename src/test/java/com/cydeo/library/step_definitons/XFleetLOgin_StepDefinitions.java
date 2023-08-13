package com.cydeo.library.step_definitons;

import com.cydeo.library.pages.XFleetLoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class XFleetLOgin_StepDefinitions {

    XFleetLoginPage loginPage = new XFleetLoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }

    @When("user clicks log in button")
    public void user_clicks_log_in_button() {
        loginPage.loginBtn.click();
    }

    @Then("title should be {string}")
    public void title_should_be(String title) {
        String expected = title;
        wait.until(ExpectedConditions.titleContains(title));
        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals(expected, actual);
    }

}

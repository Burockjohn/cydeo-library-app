package com.cydeo.library.step_definitons;

import com.cydeo.library.pages.LandingPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }

    @Given("I login as a librarian")
    public void ı_login_as_a_librarian() {
        loginPage.emailAddress.sendKeys(ConfigurationReader.getProperty("librarian1_user"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarian1_password"));
        loginPage.buttonSign.click();
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.emailAddress.sendKeys(ConfigurationReader.getProperty("librarian1_user"));
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarian1_password"));
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.emailAddress.sendKeys(ConfigurationReader.getProperty("student1_user"));
    }

    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("student1_password"));
    }

    @When("I enter username {string}")
    public void ı_enter_username(String string) {
        loginPage.emailAddress.sendKeys(string);
    }

    @When("I enter password {string}")
    public void ı_enter_password(String string) {
        loginPage.password.sendKeys(string);
    }

    @And("user clicks sign in button")
    public void userClicksSignInButton() {
        loginPage.buttonSign.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String expected = "dashboard";
        wait.until(ExpectedConditions.urlContains(expected));
        String actual = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();
    }

    @Then("user should see the books")
    public void userShouldSeeTheBooks() {
        String expected = "books";
        wait.until(ExpectedConditions.urlContains(expected));
        String actual = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();
    }


    @Then("there should be {int} users")
    public void there_should_be_users(Integer int1) {
        String expected = String.valueOf(int1);
        wait.until(ExpectedConditions.visibilityOf(landingPage.userNumbers));
        String actual = landingPage.userNumbers.getText();
        Assert.assertEquals(expected, actual);

        Driver.closeDriver();
    }

    @When("I login using {string} and {string}")
    public void ıLoginUsingAnd(String username, String password) {
        loginPage.emailAddress.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.buttonSign.click();

    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String expectedAccountUsername) {

        BrowserUtils.waitForVisibility(landingPage.accountUsername, 5);

        String actualAccountUsername = landingPage.accountUsername.getText();

        Assert.assertEquals("Account username is not as expected!"
                , expectedAccountUsername, actualAccountUsername);

        Driver.closeDriver();
    }


}

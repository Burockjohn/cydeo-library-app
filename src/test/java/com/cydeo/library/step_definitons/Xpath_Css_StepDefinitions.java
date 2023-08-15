package com.cydeo.library.step_definitons;

import com.cydeo.library.pages.Xpath_Css_Page;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Xpath_Css_StepDefinitions {

    Xpath_Css_Page xpathCssPage = new Xpath_Css_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("user enters a valid {string} locator into the box to locate CPU load")
    public void user_enters_a_valid_locator_into_the_box_to_locate_cpu_load(String selectorType) {
        xpathCssPage.selector.clear();

        switch (selectorType) {
            case "css":
                xpathCssPage.selector.sendKeys(".table.table-striped > tbody > tr:nth-child(1) > td:nth-child(2)");
                BrowserUtils.sleep(2);
                break;
            case "xpath":
                xpathCssPage.selector.sendKeys("//tr[1]/td[2]");
                BrowserUtils.sleep(2);
                break;
        }

    }

    @Then("user should see {string} text and {string}")
    public void user_should_see_text_and(String matchNumber, String expectedText) {
        String expected1 = matchNumber;
        String expected2 = expectedText;
        String actual1 = xpathCssPage.resultText.getText();
        String actual2 = xpathCssPage.highlightedText.getText();
        Assert.assertTrue(expected1.contains(actual1) && expected2.contains(actual2));

    }

    @When("user switches to xpath from css")
    public void user_switches_to_xpath_from_css() {
        //if (xpathCssPage.selectorText.getText().contains("Css")) {
        xpathCssPage.switchButton.click();
        //}
        //wait.until(ExpectedConditions.textToBePresentInElementValue(xpathCssPage.selectorText, "Xpath "));
    }

}

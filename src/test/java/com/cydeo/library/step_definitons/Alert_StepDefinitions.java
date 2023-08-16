package com.cydeo.library.step_definitons;

import com.cydeo.library.pages.AlertPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.atp.Switch;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Alert_StepDefinitions {

    AlertPage alertPage = new AlertPage();
    Alert alert;
    Boolean flag = true;

    @When("user clicks {string} button")
    public void user_clicks_button(String alertType) {

        switch (alertType) {
            case "JS Alert":
                alertPage.buttonAlert.click();
                BrowserUtils.sleep(2);
                Driver.getDriver().switchTo().alert();
                break;
            case "Js Confirm":
                alertPage.buttonConfirm.click();
                BrowserUtils.sleep(2);
                Driver.getDriver().switchTo().alert();
                break;
            case "Js Prompt":
                alertPage.buttonPrompt.click();
                BrowserUtils.sleep(2);
                Driver.getDriver().switchTo().alert();
                break;
        }


    }

    @And("user switches to popup")
    public void userSwitchesToPopup() {
        alert = Driver.getDriver().switchTo().alert();
    }

    @Then("user should see the text contains {string}")
    public void user_should_see_the_text_contains(String resultText) {
        String expected = resultText;
        String actual = alertPage.response.getText();
        System.out.println("deneme");
        Assert.assertTrue(actual.contains(expected));
    }

    @When("user {string} the alert")
    public void user_the_alert(String actions) {
        BrowserUtils.sleep(2);
        switch (actions) {
            case "accept":
                alert.accept();
                break;
            case "dismiss":
                alert.dismiss();
                flag = false;
                break;
        }

    }

    @When("user enters own name {string}")
    public void user_enters_own_name(String name) {
        alert.sendKeys(name);
        BrowserUtils.sleep(2);
    }

    @Then("user check if its own name {string} is displayed")
    public void user_check_if_its_own_name_is_displayed(String name) {
        String expected = name;
        String actual = alertPage.response.getText();
        if (flag) {
            Assert.assertTrue(actual.contains(expected));
        } else {
            Assert.assertFalse(actual.contains(expected));
        }
    }

}

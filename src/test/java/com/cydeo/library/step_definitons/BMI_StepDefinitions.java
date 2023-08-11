package com.cydeo.library.step_definitons;

import com.cydeo.library.pages.BMIPage;
import com.cydeo.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class BMI_StepDefinitions {

    BMIPage bmiPage = new BMIPage();

    @When("user enters HisHer profile specifications")
    public void userEntersHisHerProfileSpecifications(Map<String, String> profile) {
        Select select = new Select(bmiPage.genderDropdown);
        select.selectByVisibleText(profile.get("gender"));

        bmiPage.age.clear();
        bmiPage.age.sendKeys(profile.get("age"));

        bmiPage.height.clear();
        bmiPage.height.sendKeys(profile.get("height"));

        bmiPage.weight.clear();
        bmiPage.weight.sendKeys(profile.get("weight"));

    }

    @When("user clicks Calculate button")
    public void user_clicks_calculate_button() {
        bmiPage.calculateBtn.click();
        //BrowserUtils.sleep(3);
    }

    @Then("user should be shown as a {string}")
    public void user_should_be_shown_as_a(String string) {
        String expected = string;
        String actual = bmiPage.bmi.getText();
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        Assert.assertTrue(actual.contains(expected));

    }

}

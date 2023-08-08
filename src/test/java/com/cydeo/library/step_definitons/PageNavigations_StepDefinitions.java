package com.cydeo.library.step_definitons;

import com.cydeo.library.pages.LandingPage;
import com.cydeo.library.pages.PageBase;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PageNavigations_StepDefinitions {
    UsersPage usersPage = new UsersPage();
    LandingPage landingPage = new LandingPage();
    Select select;

    @Given("I click on {string} link")
    public void ı_click_on_link(String link) {
        BrowserUtils.waitForVisibility(landingPage.dashboardPageLink, 5);

        switch (link.toLowerCase()) {
            case "dashboard":
                landingPage.dashboardPageLink.click();
                break;
            case "books":
                landingPage.booksPageLink.click();
                break;
            case "users":
                landingPage.usersPageLink.click();
                break;
        }

    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer int1) {
        select = new Select(usersPage.showRecords);
        System.out.println("default value = " + select.getFirstSelectedOption());
    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> options) {
        select = new Select(usersPage.showRecords);
        List<WebElement> webElements = select.getOptions();
        List<String> actualTexts = BrowserUtils.getElementsText(webElements);
        System.out.println(actualTexts);

        Assert.assertEquals(options, actualTexts);

        Driver.closeDriver();
    }


}

package com.cydeo.library.step_definitons;

import com.cydeo.library.pages.OtpPage;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OTP_StepDefinitions {

    OtpPage otpPage = new OtpPage();
    String otpCode = otpPage.otpCode.getText();

    @When("user gets the mail address from the login page and enters it in the email box")
    public void user_enters_the_mail_address_given_in_the_login_page() {
        otpPage.emailBox.sendKeys(otpPage.mailAddress.getText());
    }

    @When("user clicks send otp code button")
    public void user_clicks_send_otp_code_button() {
        otpPage.sendBtn.click();
    }

    @When("user enters otp code into corresponding box and click verify btn")
    public void user_enters_otp_code_into_corresponding_box() {
        otpPage.otpCodeBox.sendKeys(otpCode);
        otpPage.verifyBtn.click();
    }

    @Then("user should see {string} in url")
    public void user_should_see_in_url(String string) {
        String expected = string;
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));
    }

    @When("user clicks logout button")
    public void user_clicks_logout_button() {
        otpPage.logout.click();
    }

}

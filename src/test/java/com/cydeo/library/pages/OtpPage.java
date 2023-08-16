package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtpPage {

    public OtpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='col-md-12']//li/b)[1]")
    public WebElement mailAddress;

    @FindBy(xpath = "(//div[@class='col-md-12']//li/b)[2]")
    public WebElement otpCode;

    @FindBy(id = "btn-send-otp")
    public WebElement sendBtn;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "otp")
    public WebElement otpCodeBox;

    @FindBy(id = "btn-send-verify")
    public WebElement verifyBtn;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logout;




}

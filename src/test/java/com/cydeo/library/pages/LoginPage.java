package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[id='inputEmail']")
    public WebElement emailAddress;

    @FindBy(css = "input[id='inputPassword']")
    public WebElement password;

    @FindBy(css = "button[class$='btn-block']")
    public WebElement buttonSign;

}


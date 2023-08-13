package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XFleetLoginPage {

    public XFleetLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#prependedInput")
    public WebElement username;

    @FindBy(css = "#prependedInput2")
    public WebElement password;

    @FindBy(css = "#_submit")
    public WebElement loginBtn;




}

package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

    public AlertPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "js-alert")
    public WebElement buttonAlert;

    @FindBy(id = "js-confirm")
    public WebElement buttonConfirm;

    @FindBy(id = "js-prompt")
    public WebElement buttonPrompt;

    @FindBy(id = "dialog-response")
    public WebElement response;

    

}

package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Xpath_Css_Page {

    public Xpath_Css_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[id='selector-input']")
    public WebElement selector;

    @FindBy(xpath = "//label[@for='selector-switch'][2]")
    public WebElement switchButton;

    @FindBy(css = "#matches-count b")
    public WebElement resultText;

    @FindBy(css = "p[id='chrome-cpu']")
    public WebElement highlightedText;

    @FindBy(css = "#selector-label b")
    public WebElement selectorText;

    
    
    

}

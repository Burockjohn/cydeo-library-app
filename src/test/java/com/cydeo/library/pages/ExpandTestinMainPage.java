package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExpandTestinMainPage {

    public ExpandTestinMainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[id='search-input']")
    public WebElement inputSearch;

    @FindBy(css = "#examples a")
    public List<WebElement> listedElements;



}

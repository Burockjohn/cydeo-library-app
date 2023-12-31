package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    public PageBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Users")
    public WebElement usersPageLink;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardPageLink;

    @FindBy(linkText = "Books")
    public WebElement booksPageLink;
}

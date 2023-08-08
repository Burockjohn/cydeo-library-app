package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends PageBase{

    public LandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="user_count")
    public WebElement userNumbers;

    @FindBy(css = "h2[id='book_count']")
    public WebElement bookCount;

    @FindBy(css = "a[id='navbarDropdown'] span")
    public WebElement accountUsername;




}

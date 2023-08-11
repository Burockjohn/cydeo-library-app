package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMIPage {

    public BMIPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "gender")
    public WebElement genderDropdown;

    @FindBy(id = "age")
    public WebElement age;

    @FindBy(id = "height")
    public WebElement height;

    @FindBy(id = "weight")
    public WebElement weight;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateBtn;

    @FindBy(id = "BMI")
    public WebElement bmi;


}

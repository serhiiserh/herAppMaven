package com.heroku.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownPage extends BasePage {
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropOptions;



    public DropdownPage dropdownOption(String option) {
        Select select = new Select(dropOptions);
        select.selectByVisibleText(option);
        {
            System.out.println("You choose: " + option);
        }
        return this;
    }

    @FindBy(xpath = "//option[.='Option 1']")
    WebElement option1;

    public void clickOption1(){
        click(option1);
        Assert.assertTrue(option1.isDisplayed());
    }


}

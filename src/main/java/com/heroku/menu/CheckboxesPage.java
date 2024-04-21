package com.heroku.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckboxesPage extends BasePage{
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[type='checkbox']")
    WebElement checkbox;

    public void selectCheckbox(){
        click(checkbox);
        Assert.assertTrue(checkbox.isSelected());
    }



}

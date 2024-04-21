package com.heroku.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ChallengingDOMPage extends BasePage{
    public ChallengingDOMPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".button:nth-child(1)")
    WebElement firstButton;


    @FindBy(css = ".button.alert")
    WebElement secondButton;

    @FindBy(css = ".button.success")
    WebElement thirdButton;


    public void clickButton1() {
        click(firstButton);
        Assert.assertTrue(firstButton.isEnabled());
    }
    public void clickButton2() {
        click(secondButton);
        Assert.assertTrue(secondButton.isEnabled());

    }
    public void clickButton3() {
        click(thirdButton);
        Assert.assertTrue(thirdButton.isEnabled());
    }

}

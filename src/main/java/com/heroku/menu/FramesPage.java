package com.heroku.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramesPage extends BasePage{
    public FramesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[href='/nested_frames']")
    WebElement linkNested;
    public FramesPage getLinkNested() {
        click(linkNested);
        return new FramesPage(driver);
    }

    @FindBy (css = "[href='/iframe']")
    WebElement linkIFrames;

    public FramesPage getLinkIFrames() {
        click(linkIFrames);
        return new FramesPage(driver);
    }

    @FindBy(css = ".tox-editor-container")
    WebElement iFrameContent;

    public void getIFrameContent(){
        click(iFrameContent);
        Assert.assertTrue(iFrameContent.isEnabled());

    }
}

package com.heroku.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/challenging_dom']")
    WebElement elementChallengingDOM;

    public ChallengingDOMPage getButtonsInChallengeDOM() {
        click(elementChallengingDOM);
        return new ChallengingDOMPage(driver);
    }

    @FindBy(css = "[href='/frames']")
    WebElement elementFrames;

    public FramesPage getLinkInFramesPage() {
        click(elementFrames);
        return new FramesPage(driver);
    }
    @FindBy (css = "[href='/checkboxes']")
    WebElement elementCheckboxes;

    public CheckboxesPage getCheckboxes(){
        click(elementCheckboxes);
        return new CheckboxesPage(driver);
    }

    @FindBy(css = "[href='/dropdown']")
    WebElement elementForDrop;
    public DropdownPage getDropdown(){
        click(elementForDrop);
        return new DropdownPage(driver);
    }

    @FindBy(css = "[href='/upload']")
    WebElement elementUpload;

    public UploadPage openUpload(){
        click(elementUpload);
        return new UploadPage(driver);
    }

    @FindBy(css = "[href='/broken_images']")
    WebElement images;

    public BrokenImagesPage openImagesPage(){
        click(images);
        return new BrokenImagesPage(driver);
    }


    @FindBy(css = "[href='/drag_and_drop']")
    WebElement dragDrops;

    public DragAndDropPage openDragDropPage(){
        click(dragDrops);
        return new DragAndDropPage(driver);
    }
}

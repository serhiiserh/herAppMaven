package com.heroku.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage{
    public UploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement chooseFile;

    public UploadPage clickUploadFile(String path){
        chooseFile.sendKeys(path);
        return this;
    }



}

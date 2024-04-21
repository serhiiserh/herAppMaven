package com.heroku.menu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagesPage extends BasePage{
    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "img")
    List<WebElement> allImages;

    public BrokenImagesPage checkBrokenImages() {
        System.out.println("We have " + allImages.size() + " images");
        for (int i = 0; i < allImages.size(); i++) {
            WebElement imgElement = allImages.get(i);
            String imageUrl = imgElement.getAttribute("src");
            verifyLinks(imageUrl);
            try{
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver)
                        .executeScript("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth > 0);", imgElement);
                if(imageDisplayed){
                    System.out.println("DISPLAY - OK");
                    System.out.println("============");
                }else {
                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("============");
                }
            }catch (Exception e){
                System.out.println("Error occurred");
            }
        }
        return this;
    }
}

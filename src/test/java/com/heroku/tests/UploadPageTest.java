package com.heroku.tests;

import com.heroku.menu.HomePage;
import com.heroku.menu.UploadPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadPageTest extends TestBase{

    @BeforeMethod

    public void precondition(){
        new HomePage(driver).openUpload();
    }

    @Test

    public void clickLinkUploadPage(){
        new UploadPage(driver).clickUploadFile("C:/tools/cat.jpeg");
    }
}

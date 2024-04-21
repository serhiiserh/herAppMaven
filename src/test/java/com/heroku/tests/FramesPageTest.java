package com.heroku.tests;

import com.heroku.menu.FramesPage;
import com.heroku.menu.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesPageTest extends TestBase{
    @BeforeMethod

    public void precondition(){

        new HomePage(driver).getLinkInFramesPage();
    }

    @Test

    public void clickFramePage(){

        new FramesPage(driver);
    }
}

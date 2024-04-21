package com.heroku.tests;

import com.heroku.menu.FramesPage;
import com.heroku.menu.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkNestedInFramesPageTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getLinkInFramesPage();
        new FramesPage(driver).getLinkNested();
    }

    @Test

    public void linkNestedTest() {
        new FramesPage(driver);
    }



}

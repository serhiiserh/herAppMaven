package com.heroku.tests;

import com.heroku.menu.FramesPage;
import com.heroku.menu.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkIFrameTest extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getLinkInFramesPage();
        new FramesPage(driver).getLinkIFrames();
    }

    @Test

    public void linkIFrameTest() {
        new FramesPage(driver).getIFrameContent();
    }
}

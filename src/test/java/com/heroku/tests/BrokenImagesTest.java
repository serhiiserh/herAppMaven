package com.heroku.tests;

import com.heroku.menu.BrokenImagesPage;
import com.heroku.menu.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).openImagesPage();
    }

    @Test
    public void checkBrokenImagesTest() {
        new BrokenImagesPage(driver).checkBrokenImages();
    }
}

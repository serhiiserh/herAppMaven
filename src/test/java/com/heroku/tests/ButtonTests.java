package com.heroku.tests;

import com.heroku.menu.ChallengingDOMPage;
import com.heroku.menu.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTests extends TestBase{

    @BeforeMethod

    public void precondition(){
        new HomePage(driver).getButtonsInChallengeDOM();

    }

    @Test
    public void clickButtonsTest(){
        new ChallengingDOMPage(driver).clickButton1();
        new ChallengingDOMPage(driver).clickButton2();
        new ChallengingDOMPage(driver).clickButton3();

    }

}

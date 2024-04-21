package com.heroku.tests;

import com.heroku.menu.ChallengingDOMPage;
import com.heroku.menu.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChallengingDOMTest extends TestBase{

    @BeforeMethod

public void precondition(){
        new HomePage(driver).getButtonsInChallengeDOM();
}

    @Test

    public void clickLinkChallengeDOM(){
        new ChallengingDOMPage(driver);
    }
}

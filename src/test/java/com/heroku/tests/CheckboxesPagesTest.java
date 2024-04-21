package com.heroku.tests;

import com.heroku.menu.CheckboxesPage;
import com.heroku.menu.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesPagesTest extends TestBase{

    @BeforeMethod

    public void precondition(){
        new HomePage(driver).getCheckboxes();
    }

    @Test
    public void clickInCheckbox(){
        new CheckboxesPage(driver).selectCheckbox();
    }
}

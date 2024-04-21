package com.heroku.tests;

import com.heroku.menu.DropdownPage;
import com.heroku.menu.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownOptionsTest extends TestBase {


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropdown();
    }

    @Test
    public void selectOption() {
        new DropdownPage(driver).dropdownOption("Option 2");

    }

    @Test
    public void existsOption(){
        new DropdownPage(driver).clickOption1();
    }

}

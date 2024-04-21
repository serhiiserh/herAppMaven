package com.heroku.tests;

import com.heroku.menu.DragAndDropPage;
import com.heroku.menu.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).openDragDropPage();
    }

        @Test
        public void actionDragMeTest() {
            new DragAndDropPage(driver).actionDragMe();
    }
}

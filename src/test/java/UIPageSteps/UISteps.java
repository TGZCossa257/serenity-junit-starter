package UIPageSteps;

import UIPages.UIMainCheck;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;

public class UISteps {

    UIMainCheck checkPages;
    @Step("Check the Main Page")
    public void isOnMainPage(){
        checkPages.open();
        checkPages.checkMainPage();
        Serenity.takeScreenshot();
    }

    @Step("Check the Yoga Page")
    public void isOnSecondPage(){
        checkPages.checkSecondPage();
       Serenity.takeScreenshot();
    }

    @Step("Click the Second Page")
    public void clicksSecondPage(){
        checkPages.clickSecondPage();
        Serenity.takeScreenshot();
    }

    @Step("Click the First Item")
    public void clickOnItem(){
        checkPages.clickOnItem();
        Serenity.takeScreenshot();
    }

} //End of UISteps.java
package AppTests;

import UIPageSteps.UISteps;
import net.serenitybdd.annotations.*;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class MainPageTest {
    @Steps
    UISteps UISteps;

    @Managed(driver = "firefox")
    WebDriver driver;

    @Test
    @Title("Tom C First Test")
    @Screenshots(forEachAction = true)
    @WithTag("test1")
    public void loginTest(){
        UISteps.isOnMainPage();
        UISteps.clicksSecondPage();
        UISteps.isOnSecondPage();
        UISteps.clickOnItem();
    }

}// End of MainPageTest.java

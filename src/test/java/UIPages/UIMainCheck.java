package UIPages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://magento.softwaretestingboard.com/")


public class UIMainCheck extends PageObject {

 @FindBy(xpath = "//a[@class='logo']") WebElementFacade mainLogo;
 @FindBy(xpath = "//span[text()='New Luma Yoga Collection']") WebElementFacade yogaTitle;
 @FindBy(xpath = "//a[contains(text(),'Echo Fit Compression')]") WebElementFacade compShorts;
        public void checkMainPage() {
            mainLogo.waitUntilVisible();
            waitABit(1000);
            $("//span[text()='Shop New Yoga']").waitUntilVisible();
            $("//span[text()='Shop New Yoga']").waitUntilClickable();
            }

        public void clickSecondPage(){
            $("//span[text()='Shop New Yoga']").click();
        }
         public void checkSecondPage() {
             waitABit(500);
             yogaTitle.waitUntilVisible();
             yogaTitle.isVisible();
             waitABit(1000);
         }

         public void clickOnItem(){
             waitABit(1000);
             compShorts.waitUntilClickable();
             compShorts.click();
         }



} // End of UIMainCheck.java

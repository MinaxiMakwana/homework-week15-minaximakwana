package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 4.DesktopsPage - Desktops text, Sortby, Display, selectProductList Locators and it's actions
 */

public class DesktopsPage extends Utility {

    //Elements
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement desktopPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']/a[text()='Build your own computer']")
    WebElement buildYourOwnComputer;

    //Methods
    public String getDesktopPageTitleText() {
        return getTextFromElement(desktopPageTitle);
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
    }
}

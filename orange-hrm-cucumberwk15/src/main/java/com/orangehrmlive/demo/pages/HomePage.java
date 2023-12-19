package com.orangehrmlive.demo.pages;

/**
 * 2. HomePage - Store OrangeHRM logo, Admin, PIM, Leave,Dashboard, Welcome Text
 * locatores
 * and create appropriate methods for it.
 */

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {


    //Elements
    @CacheLookup
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement adminTab;

    @CacheLookup
    @FindBy(xpath = "//span/h6[text()='Dashboard']")
    static WebElement dashboardTitle;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    WebElement userProfileLogo;
    @CacheLookup
    @FindAll
            ({@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li")})
    List<WebElement> userProfileDropDownOptions;

    //Methods

    public void clickOnAdminTab() {
        clickOnElement(adminTab);
    }

    public static String getDashboardTitleText() {
        return getTextFromElement(dashboardTitle);
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(userProfileLogo);
    }

    public void clickOnDropDownOptions(String text) {

        for (WebElement e : userProfileDropDownOptions) {
            System.out.println(e.getText());
            if (e.getText().equals(text)) {
                e.click();
                break;
            }
        }

    }


}

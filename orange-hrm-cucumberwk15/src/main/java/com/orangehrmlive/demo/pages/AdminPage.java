package com.orangehrmlive.demo.pages;
/**
 * 4.AdminPage - UserManagement, Job, Organization Tabs Locators and it's actions
 */

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {



    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteButton;

    @CacheLookup
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[6]")
    WebElement clickOnCheckBox;


    @CacheLookup
    @FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    WebElement clickOnYesDeleteButton;




    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }

    public void clickOnCheckBox(){
        clickOnElement(clickOnCheckBox);
    }

    public void deleteButton(){
        clickOnElement(clickOnYesDeleteButton);
    }

}
